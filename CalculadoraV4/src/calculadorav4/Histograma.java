/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadorav4;

import org.apache.commons.math3.stat.Frequency;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.Styler;

import java.util.*;

public class Histograma {

    private Map distributionMap;
    private int classWidth;
    private List<Double> datasetList;
    CategoryChart chart;

    public Histograma() {

        
        distributionMap = new TreeMap();
        classWidth = 10;
        Map distributionMap = processRawData();
        List yData = new ArrayList();
        yData.addAll(distributionMap.values());
        List xData = Arrays.asList(distributionMap.keySet().toArray());

        chart = buildChart(xData, yData);
        //new SwingWrapper<>(chart).displayChart();

    }
    
    public CategoryChart getChart(){
        return this.chart;
    }
    
    public Histograma(List<Double> dataset) {

        this.datasetList = dataset;
        distributionMap = new TreeMap();
        classWidth = 10;
        Map distributionMap = processRawData();
        List yData = new ArrayList();
        yData.addAll(distributionMap.values());
        List xData = Arrays.asList(distributionMap.keySet().toArray());

        CategoryChart chart = buildChart(xData, yData);
        new SwingWrapper<>(chart).displayChart();

    }
    
    public void setDataSet(List<Double> dataset){
        this.datasetList = dataset;
    }

    private CategoryChart buildChart(List xData, List yData) {

        // Create Chart
        CategoryChart chart = new CategoryChartBuilder().width(800).height(600)
                .title("Distribuição")
                .xAxisTitle("Números")
                .yAxisTitle("Frequência")
                .build();

        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
        chart.getStyler().setAvailableSpaceFill(0.99);
        chart.getStyler().setOverlapped(true);

        chart.addSeries("Valor", xData, yData);

        return chart;
    }

    private Map processRawData() {


        Frequency frequency = new Frequency();
        datasetList.forEach(d -> frequency.addValue(Double.parseDouble(d.toString())));

        datasetList.stream()
          .map(d -> Double.parseDouble(d.toString()))
          .distinct()
          .forEach(observation -> {
             long observationFrequency = frequency.getCount(observation);
             int upperBoundary = (observation > classWidth)
               ? Math.multiplyExact( (int) Math.ceil(observation / classWidth), classWidth)
               : classWidth;
             int lowerBoundary = (upperBoundary > classWidth)
               ? Math.subtractExact(upperBoundary, classWidth)
               : 0;
             String bin = lowerBoundary + "-" + upperBoundary;

             updateDistributionMap(lowerBoundary, bin, observationFrequency);

          });

        return distributionMap;
    }

    private void updateDistributionMap(int lowerBoundary, String bin, long observationFrequency) {

        int prevLowerBoundary = (lowerBoundary > classWidth) ? lowerBoundary - classWidth : 0;
        String prevBin = prevLowerBoundary + "-" + lowerBoundary;
        if(!distributionMap.containsKey(prevBin))
            distributionMap.put(prevBin, 0);

        if(!distributionMap.containsKey(bin)) {
            distributionMap.put(bin, observationFrequency);
        }
        else {
            long oldFrequency = Long.parseLong(distributionMap.get(bin).toString());
            distributionMap.replace(bin, oldFrequency + observationFrequency);
        }
    }

   

}
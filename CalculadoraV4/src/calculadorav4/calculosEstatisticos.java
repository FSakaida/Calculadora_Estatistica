package calculadorav4;

import java.util.List;
import java.util.ArrayList;
import static java.util.Collections.frequency;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.Frequency;

//https://www.baeldung.com/apache-commons-frequency
public class calculosEstatisticos {
// Get a DescriptiveStatistics instance

    DescriptiveStatistics stats;
    List<Double> dados = new ArrayList<>();
    Frequency frequencia = new Frequency();

    public calculosEstatisticos() {

    }

    public calculosEstatisticos(List<Double> dados) {
        this.dados = dados;
        this.stats = new DescriptiveStatistics();
        for (Double valor : dados) {
            stats.addValue((double) valor);
            frequencia.addValue((double) valor);
        }

    }
    public List<Double> getDados(){
        return this.dados;
    }

    public void setDados(List<Double> novos) {
        if (novos != null) {
            this.dados = novos;
            this.stats = new DescriptiveStatistics();
            for (Double valor : novos) {
                stats.addValue((double) valor);
                frequencia.addValue((double) valor);
            }
        }
    }

    public double media() {
        return stats.getMean();
    }

    public double desvioPadrao() {
        return stats.getStandardDeviation();
    }

    public double mediana() {
        return stats.getPercentile(50);
    }

    public double[] moda() {
        double data[] = dados.stream().mapToDouble(Double::doubleValue).toArray();
        return StatUtils.mode(data);
        // printar todas as modas
        // pode ser amodal
    }
    
    public int classWidth(){
        //https://geokrigagem.com.br/numero_classes_histograma_regra_sturges/
        // utilizado a regra de Sturges
        double cw, max, min;
        int nClasses;
        double[] data = (dados.stream().mapToDouble(Double::doubleValue).toArray());
        max = StatUtils.max(data);
        min = StatUtils.min(data);
        nClasses = (int) (1 + 3.322 * Math.log(data.length));
        cw = (max - min)/nClasses;
        return (int) cw;
        
    }

    public boolean ehModal() {

        for (Double dado : dados) {
            if (frequencia.getCount(moda()[0]) != frequencia.getCount(dado)) {
                return true;
            }
        }

        return false;
    }

//    public List<String[]> intervalos() {
//         return dados.stream()
//                .map(d -> Double.parseDouble(d.toString()))
//                .distinct()
//                .forEach(observation -> {
//                    long observationFrequency = frequencia.getCount(observation);
//                    int upperBoundary = (observation > classWidth())
//                            ? Math.multiplyExact((int) Math.ceil(observation / classWidth()), classWidth())
//                            : classWidth();
//                    int lowerBoundary = (upperBoundary > classWidth())
//                            ? Math.subtractExact(upperBoundary, classWidth())
//                            : 0;
//                    String bin = lowerBoundary + "-" + upperBoundary;
//
//                    //updateDistributionMap(lowerBoundary, bin, observationFrequency);
//                });
//    }

}

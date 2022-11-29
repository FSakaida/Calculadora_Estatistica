package calculadorav4;

import java.util.List;
import java.util.ArrayList;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.Frequency;

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
        
    public boolean ehModal() {

        for (Double dado : dados) {
            if (frequencia.getCount(moda()[0]) != frequencia.getCount(dado)) {
                return true;
            }
        }

        return false;
    }

}

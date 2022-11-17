package calculadorav3;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.stat.StatUtils;
public class calculosEstatisticos {
// Get a DescriptiveStatistics instance
DescriptiveStatistics stats;
double[] dados;


public calculosEstatisticos(double[] dados){
    this.dados = dados;
    this.stats = new DescriptiveStatistics();
    for( int i = 0; i < dados.length; i++) {
           stats.addValue(dados[i]);
}
}


public double media(){
    return stats.getMean();
}

public double desvioPadrao(){
    return stats.getStandardDeviation();
}

public double mediana(){
    return stats.getPercentile(50);
}

public double moda(){
    return Double.valueOf(StatUtils.mode(dados)[0]);
}
    
}

import java.util.ArrayList;
import java.util.OptionalDouble;

public class ZScorer {
    public ArrayList<Double> zScorer(ArrayList<Double> List, int sample) {
        OptionalDouble weirdAverage = List.stream().mapToDouble(a -> a).average();
        double average = weirdAverage.getAsDouble();
        double difference = 0;
        for (Double item : List) {
            double value = item - average;
            difference += Math.pow(value, 2);
        }
        double sd = Math.sqrt(difference / (List.size() - sample));
        ArrayList<Double> zScored = new ArrayList<>();
        for (Double item : List) {
            double change = item - average;
            double zScore = change / sd;
            zScored.add(zScore);
        }
        return zScored;
    }
}
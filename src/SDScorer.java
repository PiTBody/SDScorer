import java.util.ArrayList;
import java.util.OptionalDouble;

public class SDScorer {
    public ArrayList<Double> sdScorer(ArrayList<Double> List, int sample) {
        OptionalDouble weirdAverage = List.stream().mapToDouble(a -> a).average();
        double average = weirdAverage.getAsDouble();
        double difference = 0;
        for (Double item : List) {
            double value = item - average;
            difference += Math.pow(value, 2);
        }
        double sd = Math.sqrt(difference / (List.size() - sample));
        ArrayList<Double> sdScored = new ArrayList<>();
        for (Double item : List) {
            double change = item - average;
            double sdScore = change / sd;
            sdScored.add(sdScore);
        }
        return sdScored;
    }
}

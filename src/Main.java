import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> List = new ArrayList<Double>();
        System.out.println("Is this a sample (1), or a population (0)?");
        int sample = sc.nextInt();
        System.out.println("Insert the values of the list for them to be z-scored (enter 694201337 to stop):");
        double value = sc.nextDouble();
        while (value != 694201337) {
            List.add(value);
            value = sc.nextDouble();
        }
        if (!List.isEmpty()) {
            ZScorer zScorer = new ZScorer();
            System.out.println(zScorer.zScorer(List, sample));
        } else {
            System.out.println("No SD is possible without some elements of the set.");
        }
    }
}
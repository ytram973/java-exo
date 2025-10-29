package Exo4;

import java.util.ArrayList;

public class GradesUtils {

    // Moyenne des notes
    public static double average(ArrayList<Double> grades) {
        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        return sum / grades.size();
    }
}

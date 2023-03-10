package task13;

import java.util.Arrays;
import java.util.Scanner;

public class SeriesWithStepCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int begin = scanner.nextInt();
        int step = scanner.nextInt();
        int length = scanner.nextInt();

        squareMassive(begin,step,length);

    }
    public static void squareMassive(int begin, int step, int length){
        double[] resultMass = new double[length];
        double b = begin;
        for (int i = 0; i < resultMass.length; i++){
            resultMass[i] = b;
            b += step;
        }
        System.out.println(Arrays.toString(resultMass));
    }
}

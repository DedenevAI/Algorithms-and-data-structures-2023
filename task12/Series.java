package task12;

import java.util.Arrays;
import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[2];
        array[0] = scanner.nextInt();
        array[1] = scanner.nextInt();
        Arrays.sort(array);

        squareMassive(array[0],array[1]);

    }
    public static void squareMassive(int step, int length){
        double[] resultMass = new double[length];
        double b = step;
        for (int i = 0; i < resultMass.length; i++){
            resultMass[i] = Math.pow(b,2);
            b += step;
        }
        System.out.println(Arrays.toString(resultMass));
    }
}

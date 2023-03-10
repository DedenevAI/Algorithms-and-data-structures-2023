package task5;

import java.util.Arrays;
import java.util.Scanner;

public class Massive {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Write length of massive: ");
        int l = scanner.nextInt();

        System.out.println(Arrays.stream(massive(l)).sum());

    }
    public static double[] massive(int length){
        double[] a = new double[length];
        for (int i = 0; i < a.length; i++){
            a[i] = Math.pow(scanner.nextInt(),2);
        }
        return a;
    }
}

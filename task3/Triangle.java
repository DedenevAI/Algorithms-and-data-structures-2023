package task3;

import java.util.Arrays;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        double[] a = coordinate();
        double[] b = coordinate();
        double[] c = coordinate();

        System.out.println("X0 = " + division(a[0],b[0],c[0]));
        System.out.println("Y0 = " + division(a[1],b[1],c[1]));

    }
    public static double[] coordinate(){
        Scanner scanner = new Scanner(System.in);
        double[] a = new double[2];
        for (int i = 0; i < a.length; i++){
            a[i] = scanner.nextInt();
        }
        return a;
    }
    public static double division(double a, double b, double c){
        return (a + b + c)/3;
    }
}


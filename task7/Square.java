package task7;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        System.out.println(Math.floor(checkTheNearestSquare(a)));
    }
    public static double checkTheNearestSquare(double a){
        return Math.sqrt(a);
    }

}

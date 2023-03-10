package task6;

import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println(checkSimple(a));
    }
    public static boolean checkSimple(int a){
        for (int i = 2; i < a; i++){
            if (a%i == 0){
                return false;
            }
        }
        return true;
    }
}

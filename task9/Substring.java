package task9;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println(checkEndOfString(a,b));
    }
   public static boolean checkEndOfString(String a, String b){
        return a.endsWith(b);
   }
}

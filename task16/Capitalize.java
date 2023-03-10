package task16;

import java.util.Scanner;

public class Capitalize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int flag = countUpperLower(s);
        if(flag == 1){
            System.out.println(s.toUpperCase());
        }else if (flag == -1){
            System.out.println(s.toLowerCase());
        } else {
            System.out.println(s);
        }
    }
    public static int countUpperLower(String s){
        int upperCase = 0;
        int lowerCase = 0;
        char[] ch = s.toCharArray();
        for(char chh : ch) {
            if(chh >='A' && chh <='Z') {
                upperCase++;
            } else if (chh >= 'a' && chh <= 'z') {
                lowerCase++;
            }
        }
        if(upperCase > lowerCase){
            return 1;
        } else if (upperCase < lowerCase){
            return -1;
        }
        return 0;
    }
}

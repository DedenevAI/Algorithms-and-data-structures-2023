package task11;

import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] rus = {"у", "е", "ё", "ы", "а", "о", "э", "я", "и", "ю"};
        for (String s : rus) {
            line = line.replace(s, "");
        }
        System.out.println(line);
    }
}

package task23;

import java.util.Scanner;

public class ScannerT {
    public static int[] getNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 3 числа (длину ряда, первый делитель, второй делитель) \nв формате 10 2 3 : ");
        return convertToStringArray(in.nextLine().split(" "));
    }
    private static int[] convertToStringArray(String[] stringArray) {
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }
}

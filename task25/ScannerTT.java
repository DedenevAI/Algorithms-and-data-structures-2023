package task25;

import java.util.Scanner;

public class ScannerTT {
    public static int[] getNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа (начало ряда, конец ряда, делители) \nв формате 5 10 2 5 : ");
        return convertToStringArray(in.nextLine().split(" "));
    }
    private static int[] convertToStringArray(String[] stringArray) {
        int[] intArray = new int[stringArray.length];
        intArray[0] = Integer.parseInt(stringArray[0]);
        intArray[1] = Integer.parseInt(stringArray[1]);
        for (int i = 2; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }
}

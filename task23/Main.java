package task23;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] elements = ScannerT.getNumbers();
        int size = elements[0];
        int firstDivider = elements[1];
        int secondDivider = elements[2];
        Row testRow = new Row(size);
        System.out.println("Ряд: " + Arrays.toString(testRow.getRow()));
        System.out.println("Сумма: " + testRow.calculateSum(firstDivider, secondDivider));
    }
}

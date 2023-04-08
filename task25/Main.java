package task25;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] elements = ScannerTT.getNumbers();
        int start = elements[0];
        int end = elements[1];
        int[] dividers = TaskUtil.getDividers(elements);
        TaskUtil testRow = new TaskUtil(start, end);
        System.out.println("Ряд: " + Arrays.toString(testRow.getRow()));
        System.out.println("Сумма: " + testRow.calculateSum(dividers));
    }
}

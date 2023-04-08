package task18;

import java.util.Arrays;
import java.util.Scanner;

public class Massive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array of numbers:");
        String input = scanner.nextLine();

        String[] strArray = input.split(" ");
        int[] arr = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }

        int[] result = maxValueAndSplit(arr);
        int maxVal = result[0];
        int maxIndex = result[1];

        int[] leftArr = Arrays.copyOfRange(arr, 0, maxIndex);
        int[] rightArr = Arrays.copyOfRange(arr, maxIndex + 1, arr.length);


        System.out.println("First array: " + Arrays.toString(leftArr));
        System.out.println("Second array: " + Arrays.toString(rightArr));
        System.out.println("Maximum: " + maxVal);
    }

    public static int[] maxValueAndSplit(int[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return new int[]{arr[maxIndex], maxIndex};
    }
}

package task25;

public class TaskUtil {
    private int[] row;
    TaskUtil(int start, int end) {
        int[] row = new int[end - start + 1];
        this.row = fillRow(row, start);
    }
    private int[] fillRow(int[] row, int start) {
        int number = start;
        for (int i = 0; i < row.length; i++) {
            row[i] = number;
            number++;
        }
        return row;
    }

    public int[] getRow() {
        return row;
    }

    public int calculateSum(int[] array) {
        int[] row = this.row;
        int sum = 0;
        for (int i = 0; i < row.length; i++) {
            int a = 0;
            for (int j = 0; j < array.length; j++) {
                a += row[i] % array[j];
            }
            if (a == 0) {
                sum += row[i];
            }
        }
        return sum;
    }
    public static int[] getDividers(int[] array) {
        int[] newArray = new int[array.length - 2];
        int j = 0;
        for (int i = 2; i < array.length; i++) {
            newArray[j] = array[i];
            j++;
        }
        return newArray;
    }
}

package task23;

public class Row {
    private int[] row;
    Row(int size) {
        int[] row = new int[size];
        this.row = fillRow(row);
    }
    private int[] fillRow(int[] row) {
        int number = 1;
        for (int i = 0; i < row.length; i++) {
            row[i] = number;
            number++;
        }
        return row;
    }

    public int[] getRow() {
        return row;
    }

    public int calculateSum(int firstDivider, int secondDivider) {
        int[] row = this.row;
        int sum = 0;
        for (int i = 0; i < row.length; i++) {
            if ((row[i] % firstDivider == 0) | (row[i] % secondDivider == 0)) {
                sum += row[i];
            }
        }
        return sum;
    }
}

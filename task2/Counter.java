package task2;

import java.util.*;

public class Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int countOfPeople = scanner.nextInt();
        boolean[] array = new boolean[countOfPeople];

        int countOfWorkers = 0;

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextBoolean();
            if(array[i]){
                countOfWorkers += 1;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println(countOfWorkers);

    }
}

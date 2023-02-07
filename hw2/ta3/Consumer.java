package by.hw2.ta3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Consumer {
    private int[] array = new int[5];
    private int count, sum;
    public Consumer() {
        this.array = array;
    }
    public void accumulation (int x) {
        if (count < 5) {
            array[count] = x;
            count++;
        } else {
            for (int i = 0; i < (array.length - 1); i++) {
                array[i] = array[i + 1];
            }
            array[4] = x;
        }
    }
    public void printAvg () {
        System.out.println(Arrays.toString(array));
        sum = IntStream.of(array).sum();
        System.out.println("Average: " + ((double) sum / count));
    }
}

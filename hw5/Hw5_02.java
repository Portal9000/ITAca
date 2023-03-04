package by.itacademy.homework.hw5;

import java.util.Scanner;

public class Hw5_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String stopWord = "stop";
        int sum = 0, counter = 0;

        while (true) {
            System.out.println("Please enter number or stop-word:");
            if (in.hasNextInt()) {
                System.out.println("Sum = " + (sum += in.nextInt()));
                System.out.println("Count = " + (++counter));
            } else if (in.nextLine().equals(stopWord)){
                System.out.println("Sum = " + sum);
                System.out.println("Count = " + counter);
                System.out.println("Avg = " + (1.0 * sum / counter));
                in.close();
                break;
            }
        }
    }
}
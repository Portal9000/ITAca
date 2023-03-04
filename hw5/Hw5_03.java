package by.itacademy.homework.hw5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Hw5_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String stopWord = "stop";
        String status = "status";
        String text = "";
        ArrayList<Double> nums = new ArrayList<Double>();
        while (!text.equals(stopWord)) {
            System.out.println("Please enter number or stop-word:");
            text = in.nextLine();
            try {
                nums.add(Double.valueOf(Double.parseDouble(text)));
            } catch (Exception e) {
            }
            if (text.equals(status)) {
                Collections.sort(nums);
                System.out.println(nums);
            }
        }
        in.close();
    }
}
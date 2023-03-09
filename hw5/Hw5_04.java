package by.itacademy.homework.hw5;

import java.util.Scanner;
public class Hw5_04 {
    private Scanner in = new Scanner(System.in);
    private double numberX = 0, numberY = 0, result = 0;
    private String action;

    public static void main(String[] args) {
        Hw5_04 value = new Hw5_04();
        value.start();
    }
    public void start(){
        action = enterOption();
        numberX = enterNumber("first");
        numberY = enterNumber("second");
        mathAction(action, numberX, numberY);
        printResult(action, numberX, numberY, result);
        System.out.println("\n");
        start();
    }
    public String enterOption() {
        do {
            System.out.println("What action are we going to take?\n'+', '-', '*', '/', 'q' - quit");
            action = in.nextLine();
        } while (!action.matches("[+-//*q]"));
        if (action.equals("q")) {
            bye();
        }
        return action;
    }
    public double enterNumber(String num) {
        System.out.println("Enter " + num + " number");
        double number;
        if (in.hasNextDouble()) {
            number = in.nextDouble();
        } else {
            System.out.println("It is not number");
            in.next();
            number = enterNumber(num);
        }
        if (action.equals("/") && num.equals("second") && number == 0) {
            System.out.println("Cannot be divided by zero.");
            number = enterNumber("second");
        }
        return number;
    }
    public double mathAction(String action, double x, double y) {
        switch (action) {
            case "+":
                result =  x + y;
                break;
            case "-":
                result =  x - y;
                break;
            case "*":
                result =  x * y;
                break;
            case "/":
                result =  x / y;
                break;
        }
        return result;
    }
    public void printResult(String action, double x, double y, double result) {
        System.out.println(String.format("%s %s %s = %s", x, action, y, result));
    }
    public void bye(){
        System.out.println("BYE!!!");
        in.close();
        System.exit(0);
    }
}
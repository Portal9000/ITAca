package by.itacademy.homework.hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Hw5_05 {
    private final static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int size;
        while (true) {
            size = setSize();
            if (size > 0) {
                break;
            }
        }
        int[][] matrix1 = new int[size][size];
        int[][] matrix2 = new int[size][size];
        int[][] matrixSum = new int[size][size];
        int[][] matrixSub = new int[size][size];
        Hw5_05 matrix = new Hw5_05();
        matrix1 = matrix.fillingMatrix(size, "Matrix1");
        matrix2 = matrix.fillingMatrix(size, "Matrix2");

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrixSum[i][j] += matrix1[i][j] + matrix2[i][j];
                matrixSub[i][j] += matrix1[i][j] - matrix2[i][j];
            }
        }
        System.out.print("Matrix1: ");
        System.out.println(Arrays.deepToString(matrix1));
        System.out.print("Matrix2: ");
        System.out.println(Arrays.deepToString(matrix2));
        System.out.print("Matrix1 + Matrix2: ");
        System.out.println(Arrays.deepToString(matrixSum));
        System.out.print("Matrix1 - Matrix2: ");
        System.out.println(Arrays.deepToString(matrixSub));
        in.close();
    }
    public static int setSize() {
        int size = -1;
        while (true) {
            System.out.println("Enter the size of the Matrix (positive integer, one number).");
            if (in.hasNext()) {
                if (in.hasNextInt()) {
                    return in.nextInt();
                }
            }
            in.next();
        }
    }
    private int[][] fillingMatrix(int size, String matrixName) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                while (true) {
                    System.out.println("Enter [" + i + "][" + j + "] " + matrixName + " element (integer).");
                    if (in.hasNext()) {
                        if (in.hasNextInt()) {
                            matrix[i][j] = in.nextInt();
                            break;
                        }
                    }
                    in.next();
                }
            }
        }
        return matrix;
    }
}

/*
//            try {
//                System.out.println("Enter the size of the Matrix (one number).");
//                size = in.nextInt();
//                return size;
//            } catch (Exception e) {
//                System.out.println("I need a positive integer.");
//            }
 */

/*
package by.itacademy.homework.hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Hw5_05 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size of the Matrix (one number).");
        int size = in.nextInt();
        int[][] matrix1 = new int[size][size];
        int[][] matrix2 = new int[size][size];
        int[][] matrixSum = new int[size][size];
        int[][] matrixSub = new int[size][size];
        Hw5_05 matrix = new Hw5_05();
        matrix1 = matrix.fillingMatrix(size, "Matrix1");
        matrix2 = matrix.fillingMatrix(size, "Matrix2");

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrixSum[i][j] += matrix1[i][j] + matrix2[i][j];
                matrixSub[i][j] += matrix1[i][j] - matrix2[i][j];
            }
        }
        System.out.print("Matrix1: ");
        System.out.println(Arrays.deepToString(matrix1));
        System.out.print("Matrix2: ");
        System.out.println(Arrays.deepToString(matrix2));
        System.out.print("Matrix1 + Matrix2: ");
        System.out.println(Arrays.deepToString(matrixSum));
        System.out.print("Matrix1 - Matrix2: ");
        System.out.println(Arrays.deepToString(matrixSub));
        in.close();
    }
    public int[][] fillingMatrix(int size, String matrixName) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Enter [" + i + "][" + j + "] " + matrixName + " element.");
                matrix[i][j] = in.nextInt();
            }
        }
        return matrix;
    }
}

 */
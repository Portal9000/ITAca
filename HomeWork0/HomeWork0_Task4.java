public class HomeWork0_Task4 {
    public static void main(String[] args) {
        int[][] matrix = {{2, 0, -2, -3}, {-5, -6, 7, 8, 0, 1}};
        int positiveNumber = 0;
        int negativeNumber = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    if (matrix[i][j] > 0) {
                        positiveNumber++;
                    } else {
                        negativeNumber++;
                    }
                }
            }
        }
        if (positiveNumber == negativeNumber) {
            System.out.println("Положительных и отрицательных чисел одинаковое количество.");
        } else {
            if (positiveNumber > negativeNumber) {
                System.out.println("Положительных чисел больше.");
            } else {
                System.out.println("Отрицательных чисел больше.");
            }
        }
    }
}
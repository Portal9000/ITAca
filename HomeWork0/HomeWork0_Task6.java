public class HomeWork0_Task6 {
    public static void main(String[] args) {
        int[][] matrix1 = {{2, 0, 7}, {2, 2, -5}, {2, 2, 5}};
        int[][] matrix2 = {{3, -4, 1}, {9, 0, 0}, {2, 5, 1}};
        String lineMatrix = "";

        System.out.println("Матрица 1 + Матрица 2");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                lineMatrix += matrix1[i][j] + matrix2[i][j] + " ";
            }
            lineMatrix = lineMatrix.substring(0, (lineMatrix.length() - 1)); // убираем последний лишний пробел
            System.out.print(lineMatrix);
            lineMatrix = "";
            System.out.println();
        }

        System.out.println();
        System.out.println("Матрица 1 - Матрица 2");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                lineMatrix += matrix1[i][j] - matrix2[i][j] + " ";
            }
            lineMatrix = lineMatrix.substring(0, (lineMatrix.length() - 1));
            System.out.print(lineMatrix);
            lineMatrix = "";
            System.out.println();
        }

        System.out.println();
        System.out.println("Матрица 2 - Матрица 1");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                lineMatrix += matrix2[i][j] - matrix1[i][j] + " ";
            }
            lineMatrix = lineMatrix.substring(0, (lineMatrix.length() - 1));
            System.out.print(lineMatrix);
            lineMatrix = "";
            System.out.println();
        }
    }
}

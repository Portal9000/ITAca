public class HomeWork0_Task5 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 0, 0}, {2, 3, 0, 0}, {4, 5, 6, 0}, {7, 8, 9, 10}};
        int downTriangle = 0;
        int upTriangle = 0;
        int matrixSquare = 0;
        int matrixLength = matrix.length;

        for (int i = 0; i < matrixLength; i++) {
            if (matrixLength != matrix[i].length) {
                matrixSquare++;
            }
        }
        if (matrixSquare != 0) {
            System.out.println("Матрица не является квадратной и, соответственно, не может быть треугольной.");
        } else {
            for (int k = 0; k < matrixLength; k++) {
                for (int l = 0; l <= k; l++) {
                    if (matrix[k][l] != 0) {
                        downTriangle++;
                    }
                }
            }
            if (downTriangle == 0) {
                System.out.println("Матрица не является нижней треугольной");
            } else {
                for (int x = 0, y, z = 1; x < matrixLength; x++, z++) {
                    for (y = z; y < matrixLength; y++) {
                        if (matrix[x][y] != 0) {
                            upTriangle++;
                            System.out.println(matrix[x][y]);
                        }
                    }
                }
                if (upTriangle != 0) {
                    System.out.println("2Матрица не является нижней треугольной");
                } else {
                    System.out.println("Матрица является нижней треугольной");
                }
            }
        }
    }
}
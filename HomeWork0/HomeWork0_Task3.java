import java.util.Arrays;
public class HomeWork0_Task3 {
    public static void main(String[] args) {
        int[] array = {2, 4, 8, 16, 1, 0, -1, -2};
        int techNumber;                            // ячейка для обмена
        for (int i = 0; i < (array.length / 2); i++) {
            techNumber = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = techNumber;
            }
        System.out.println(Arrays.toString(array));
    }
}
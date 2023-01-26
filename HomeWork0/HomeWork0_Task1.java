public class HomeWork0_Task1 {
    public static void main(String[] args) {
        int[] array = {2, 5, 9, 32, 13, -8, 0, 98, 13, 23, 64};
        int number = 13;                                           // исключаемое число
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
                sum += array[i];
            }
        }
        System.out.println("Сумма чисел массива за исключением числа " + number + " равна " + sum);
    }
}
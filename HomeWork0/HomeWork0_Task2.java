public class HomeWork0_Task2 {
    public static void main(String[] args) {
        int number = 10;                        //предел индекса
        int[] array = new int[number];
        array[0] = 0;
        array[1] = 1;
        int sum = 0;
        for (int i = 2; i < number; i++) {
            array[i] = array[i - 2] + array[i - 1];
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        System.out.println("Сумма четных чисел в последовательности Фибоначчи до индекса " + number + " равна " + sum);
    }
}
package by.hw2.ta3;
public class Main {
    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        consumer.accumulation(3);
        consumer.accumulation(1);
        consumer.accumulation(2);
        consumer.accumulation(0);
        consumer.accumulation(0);
        consumer.accumulation(8);

        consumer.printAvg();
    }
}

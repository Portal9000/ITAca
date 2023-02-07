package by.hw2.ta4;

public class Main {
    public static void main(String[] args) {
        Car carAudi = new Car("Audi", "Blue"); // Blue. Red. Green
        Car carBMW = new Car("BMW", "Orange"); // Orange. Black. Violet
        Car carKIA = new Car("KIA", "Yellow"); // Yellow. Gray. White

        carAudi.changeColor("Audi", "Red");
        carAudi.print();

        carBMW.changeColor("BMW", "Black");
        carBMW.print();

        carKIA.changeColor("KIA", "Red");
        carKIA.print();
    }
}

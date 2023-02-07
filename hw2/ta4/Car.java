package by.hw2.ta4;

public class Car {
    private String model;
    private String color;
    private enum ColorAudi {
        Blue,
        Red,
        Green;
    }
    private enum ColorBMW {
        Orange,
        Black,
        Violet;
    }
    private enum ColorKIA {
        Yellow,
        Gray,
        White;
    }


    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
    public void changeColor(String model, String color) {
        switch (model) {
            case "Audi":
                for (ColorAudi ink : ColorAudi.values()) {
                    if (ink.toString().equals(color)) {
                        this.color = color;
                        break;
                    }
                }
                break;
            case "BMW":
                for (ColorBMW ink : ColorBMW.values()) {
                    if (ink.toString().equals(color)) {
                        this.color = color;
                        break;
                    }
                }
                break;
            case "KIA":
                for (ColorKIA ink : ColorKIA.values()) {
                    if (ink.toString().equals(color)) {
                        this.color = color;
                        break;
                    }
                }
                break;
        }
    }
    public void print () {
        System.out.println(model + " - " + color);
    }
}
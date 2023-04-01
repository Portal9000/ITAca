package by.itacademy.homework.homework333.cars.model.cars;

import by.itacademy.homework.homework333.cars.model.enums.common.*;

import java.util.HashSet;
import java.util.Set;

import static java.lang.String.format;

public class Car {

//    private static final String TO_STRING_TEMPLATE = "Car{year: %s, model: %s, engineVol: %s, color: %s, wheelSize: %s, options: %s}"; // TODO Delete

    public final int year;
    public final Model model;
    public final EngineVolume engineVolume;

    public Color color;
    public WheelSize wheelSize;
    public Set<Option> options;

    public Car(int year, Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> options) {
        this.year = year;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.wheelSize = wheelSize;
        this.options = options != null ? options : new HashSet<>();
    }

    public Model getModel() {
        return model;
    }

    public EngineVolume getEngineVolume() {
        return engineVolume;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public WheelSize getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(WheelSize wheelSize) {
        this.wheelSize = wheelSize;
    }

    public Set<Option> getOptions() {
        return options;
    }

    public void setOptions(Set<Option> options) {
        this.options = options;
    }


//    @Override                          // TODO Delete
//    public String toString() {
//        return format(
//            TO_STRING_TEMPLATE,
//            year,
//            model,
//            engineVolume,
//            color,
//            wheelSize,
//            options
//        );
//    }

}

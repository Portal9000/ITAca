package by.itacademy.homework.homework333.cars.model.cars;

import by.itacademy.homework.homework333.cars.model.enums.common.*;

import java.util.Set;

import static java.lang.String.format;

public class SportCar extends Car {
    private static final String TO_STRING_TEMPLATE = "Car{year: %s, model: %s, engineVol: %s, color: %s, wheelSize: %s, options: %s, fullSpeed: %s}";
    private final int fullSpeed;
    public SportCar(int year, Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> options, int fullSpeed) {
        super(year, model, engineVolume, color, wheelSize, options);
        this.fullSpeed = fullSpeed;
    }

    public int getFullSpeed() {
        return fullSpeed;
    }
    @Override
    public String toString() {
        return format(
                TO_STRING_TEMPLATE,
                year,
                model,
                engineVolume,
                color,
                wheelSize,
                options,
                fullSpeed
        );
    }
}

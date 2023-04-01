package by.itacademy.homework.homework333.cars.model.cars;

import by.itacademy.homework.homework333.cars.model.enums.common.*;

import java.util.Set;

import static java.lang.String.format;

public class TruckCar extends Car {
    private static final String TO_STRING_TEMPLATE = "Car{year: %s, model: %s, engineVol: %s, color: %s, wheelSize: %s, options: %s, loadCapacity: %s}";
    private final short loadCapacity;

    public TruckCar(int year, Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> options, short loadCapacity) {
        super(year, model, engineVolume, color, wheelSize, options);
        this.loadCapacity = loadCapacity;
    }

    public short getLoadCapacity() {
        return loadCapacity;
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
                loadCapacity
        );
    }
}

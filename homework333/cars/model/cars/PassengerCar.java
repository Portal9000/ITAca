package by.itacademy.homework.homework333.cars.model.cars;

import by.itacademy.homework.homework333.cars.model.enums.common.*;

import java.util.Set;

import static java.lang.String.format;

public class PassengerCar extends Car {
    private static final String TO_STRING_TEMPLATE = "Car{year: %s, model: %s, engineVol: %s, color: %s, wheelSize: %s, options: %s, passengerСapacity: %s}";
    private final byte passengerСapacity;
    public PassengerCar(int year, Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> options, byte passengerСapacity) {
        super(year, model, engineVolume, color, wheelSize, options);
        this.passengerСapacity = passengerСapacity;
    }

    public byte getPassengerСapacity() {
        return passengerСapacity;
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
                passengerСapacity
        );
    }
}

package by.itacademy.homework.homework333.cars.factory.factorys;

import by.itacademy.homework.homework333.cars.factory.storages.PassengerStorage;
import by.itacademy.homework.homework333.cars.model.cars.PassengerCar;
import by.itacademy.homework.homework333.cars.model.enums.PassCapacity;
import by.itacademy.homework.homework333.cars.model.enums.common.Color;
import by.itacademy.homework.homework333.cars.model.enums.common.EngineVolume;
import by.itacademy.homework.homework333.cars.model.enums.common.Model;
import by.itacademy.homework.homework333.cars.model.enums.common.Option;
import by.itacademy.homework.homework333.cars.model.enums.common.WheelSize;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.String.format;

public class PassengerFactory {

    private static final int YEAR = 2022;

    private final Color[] colors;
    private final Model[] models;
    private final WheelSize[] wheelSizes;
    private final EngineVolume[] engineVolumes;
    private final PassCapacity[] passengerСapacityList;
    private final byte passengerСapacity;

    private final PassengerStorage passengerStorage;

    public PassengerFactory(Color[] colors, Model[] models, WheelSize[] wheelSizes, EngineVolume[] engineVolumes, PassCapacity[] passengerСapacityList, byte passengerСapacity) {
        this.colors = colors;
        this.models = models;
        this.wheelSizes = wheelSizes;
        this.engineVolumes = engineVolumes;
        this.passengerСapacityList = passengerСapacityList;
        this.passengerСapacity = passengerСapacity;
        this.passengerStorage = new PassengerStorage();
        fillPassengerStorageWithPassengerCars();
    }

    public PassengerCar createPassengerCar(Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> options, byte passengerСapacity) {
        PassengerCar car = passengerStorage.getPassengerCarFromPassengerStorage(model, engineVolume, color, wheelSize, passengerСapacity);
        if (car != null) {
            if (car.getColor() != color) {
                car.setColor(color);
            }
            if (car.getWheelSize() != wheelSize) {
                car.setWheelSize(wheelSize);
            }
            // Add options check if needed.
            car.setOptions(options);
            return car;
        }
        return new PassengerCar(YEAR, model, engineVolume, color, wheelSize, options, passengerСapacity);
    }

    public String getConfigurations() {
        return format(
                "Factory can produce: colors: %s, models: %s, wheelSizes: %s, engineVolumes: %s, passengerСapacity: %s",
                Arrays.toString(colors),
                Arrays.toString(models),
                Arrays.toString(wheelSizes),
                Arrays.toString(engineVolumes),
                Arrays.toString(passengerСapacityList)
        );
    }


    private void fillPassengerStorageWithPassengerCars() {
        // Any custom logic about creating initial cars.
        PassengerCar car = new PassengerCar(YEAR, Model.AUDI_A4, EngineVolume.HIGH, Color.RED, WheelSize.SMALL, new HashSet<>(), passengerСapacity);
        this.passengerStorage.addPassengerCarToPassengerStorage(car);
        Set<Option> options = new HashSet<>();
        options.add(Option.ABS);
        car = new PassengerCar(YEAR, Model.BMW_x6, EngineVolume.LOW, Color.RED, WheelSize.SMALL, options, passengerСapacity);
        this.passengerStorage.addPassengerCarToPassengerStorage(car);
    }
}

package by.itacademy.homework.homework333.cars.factory.factorys;

import by.itacademy.homework.homework333.cars.factory.storages.TruckStorage;
import by.itacademy.homework.homework333.cars.model.cars.TruckCar;
import by.itacademy.homework.homework333.cars.model.enums.TruckCapacity;
import by.itacademy.homework.homework333.cars.model.enums.common.Color;
import by.itacademy.homework.homework333.cars.model.enums.common.EngineVolume;
import by.itacademy.homework.homework333.cars.model.enums.common.Model;
import by.itacademy.homework.homework333.cars.model.enums.common.Option;
import by.itacademy.homework.homework333.cars.model.enums.common.WheelSize;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.String.format;

public class TruckFactory {

    private static final int YEAR = 2022;

    private final Color[] colors;
    private final Model[] models;
    private final WheelSize[] wheelSizes;
    private final EngineVolume[] engineVolumes;
    private final TruckCapacity[] loadCapacityList;
    private final short loadCapacity;

    private final TruckStorage truckStorage;

    public TruckFactory(Color[] colors, Model[] models, WheelSize[] wheelSizes, EngineVolume[] engineVolumes, TruckCapacity[] loadCapacityList, short loadCapacity) {
        this.colors = colors;
        this.models = models;
        this.wheelSizes = wheelSizes;
        this.engineVolumes = engineVolumes;
        this.loadCapacityList = loadCapacityList;
        this.loadCapacity = loadCapacity;
        this.truckStorage = new TruckStorage();
        fillTruckStorageWithTruckCars();
    }

    public TruckCar createTruckCar(Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> options, short loadCapacity) {
        TruckCar car = truckStorage.getTruckCarFromTruckStorage(model, engineVolume, color, wheelSize, loadCapacity);
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
        return new TruckCar(YEAR, model, engineVolume, color, wheelSize, options, loadCapacity);
    }

    public String getConfigurations() {
        return format(
                "Factory can produce: colors: %s, models: %s, wheelSizes: %s, engineVolumes: %s, loadCapacity: %s",
                Arrays.toString(colors),
                Arrays.toString(models),
                Arrays.toString(wheelSizes),
                Arrays.toString(engineVolumes),
                Arrays.toString(loadCapacityList)
        );
    }


    private void fillTruckStorageWithTruckCars() {
        // Any custom logic about creating initial cars.
        TruckCar car = new TruckCar(YEAR, Model.AUDI_A4, EngineVolume.HIGH, Color.RED, WheelSize.SMALL, new HashSet<>(), loadCapacity); // loadCapacity = ?
        this.truckStorage.addTruckCarToTruckStorage(car);
        Set<Option> options = new HashSet<>();
        options.add(Option.ABS);
        car = new TruckCar(YEAR, Model.BMW_x6, EngineVolume.LOW, Color.RED, WheelSize.SMALL, options, loadCapacity);            // loadCapacity = ?
        this.truckStorage.addTruckCarToTruckStorage(car);
    }
}


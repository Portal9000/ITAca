package by.itacademy.homework.homework333.cars.factory.factorys;

import by.itacademy.homework.homework333.cars.factory.storages.SportStorage;
import by.itacademy.homework.homework333.cars.model.cars.SportCar;
import by.itacademy.homework.homework333.cars.model.enums.SportSpeed;
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

public class SportFactory {

    private static final int YEAR = 2022;

    private final Color[] colors;
    private final Model[] models;
    private final WheelSize[] wheelSizes;
    private final EngineVolume[] engineVolumes;
    private final SportSpeed[] fullSpeedList;
    private final int fullSpeed;

    private final SportStorage sportStorage;

    public SportFactory(Color[] colors, Model[] models, WheelSize[] wheelSizes, EngineVolume[] engineVolumes, SportSpeed[] fullSpeedList, int fullSpeed) {
        this.colors = colors;
        this.models = models;
        this.wheelSizes = wheelSizes;
        this.engineVolumes = engineVolumes;
        this.fullSpeedList = fullSpeedList;
        this.fullSpeed = fullSpeed;
        this.sportStorage = new SportStorage();
        fillSportStorageWithSportCars();
    }

    public SportCar createSportCar(Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> options, int fullSpeed) {
        SportCar car = sportStorage.getSportCarFromSportStorage(model, engineVolume, color, wheelSize, fullSpeed);
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
        return new SportCar(YEAR, model, engineVolume, color, wheelSize, options, fullSpeed);
    }

    public String getConfigurations() {
        return format(
                "Factory can produce: colors: %s, models: %s, wheelSizes: %s, engineVolumes: %s, fullSpeed: %s",
                Arrays.toString(colors),
                Arrays.toString(models),
                Arrays.toString(wheelSizes),
                Arrays.toString(engineVolumes),
                Arrays.toString(fullSpeedList)
        );
    }


    private void fillSportStorageWithSportCars() {
        // Any custom logic about creating initial cars.
        SportCar car = new SportCar(YEAR, Model.AUDI_A4, EngineVolume.HIGH, Color.RED, WheelSize.SMALL, new HashSet<>(), fullSpeed);
        this.sportStorage.addSportCarToSportStorage(car);
        Set<Option> options = new HashSet<>();
        options.add(Option.ABS);
        car = new SportCar(YEAR, Model.BMW_x6, EngineVolume.LOW, Color.RED, WheelSize.SMALL, options, fullSpeed);
        this.sportStorage.addSportCarToSportStorage(car);
    }
}
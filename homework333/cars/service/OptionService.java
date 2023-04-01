package by.itacademy.homework.homework333.cars.service;

import by.itacademy.homework.homework333.cars.model.cars.Car;
import by.itacademy.homework.homework333.cars.model.enums.common.Option;

import java.util.Set;

public class OptionService {

    public void addOption(Car car, Option option) {
        if (car != null && option != null) {
            car.getOptions().add(option);
        }
    }

    public void deleteOption(Car car, Option option) {
        if (car != null && option != null) {
            car.getOptions().remove(option);
        }
    }

    public void setOptions(Car car, Set<Option> options) {
        if (car != null && options != null) {
            car.setOptions(options);
        }
    }

}

package by.itacademy.homework.homework333.cars.service;

import by.itacademy.homework.homework333.cars.model.cars.Car;
import by.itacademy.homework.homework333.cars.model.enums.common.WheelSize;

public class WheelService {

    public void changeWheels(Car car, WheelSize wheelSize) {
        if (car != null && wheelSize != null && !wheelSize.equals(car.getWheelSize())) {
            car.setWheelSize(wheelSize);
        }
    }
}

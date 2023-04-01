package by.itacademy.homework.homework333.cars.service;

import by.itacademy.homework.homework333.cars.model.cars.Car;
import by.itacademy.homework.homework333.cars.model.enums.common.Color;

public class ColorService {

    public void changeColor(Car car, Color color) {
        if (car != null && color != null && !color.equals(car.getColor())) {
            car.setColor(color);
        }
    }
}

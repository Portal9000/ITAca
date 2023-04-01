package by.itacademy.homework.homework333.cars.showroom;

import by.itacademy.homework.homework333.cars.model.cars.Car;
import by.itacademy.homework.homework333.cars.model.enums.common.Color;
import by.itacademy.homework.homework333.cars.model.enums.common.EngineVolume;
import by.itacademy.homework.homework333.cars.model.enums.common.Model;
import by.itacademy.homework.homework333.cars.model.enums.common.Option;
import by.itacademy.homework.homework333.cars.model.enums.common.WheelSize;

import java.util.Set;

public class Showroom {

    private final Service service;
    private final Factory factory;

    public Showroom(Service service, Factory factory) {
        this.service = service;
        this.factory = factory;
    }

    public Car orderCar(Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> options) {
        return factory.createCar(model, engineVolume, color, wheelSize, options);
    }

    public void changeColor(Car car, Color color) {
        service.changeColor(car, color);
    }

    public void changeWheels(Car car, WheelSize wheelSize) {
        service.changeWheels(car, wheelSize);
    }

    public void addOption(Car car, Option option) {
        service.addOption(car, option);
    }

    public void deleteOption(Car car, Option option) {
        service.deleteOption(car, option);
    }

    public void setOptions(Car car, Set<Option> options) {
        service.setOptions(car, options);
    }

    public void printFactorySettings() {
        System.out.println(factory.getConfigurations());
    }

}

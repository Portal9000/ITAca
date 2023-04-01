package by.itacademy.homework.homework333;

import by.itacademy.homework.homework333.cars.model.cars.Car;
import by.itacademy.homework.homework333.cars.model.enums.common.Color;
import by.itacademy.homework.homework333.cars.model.enums.common.EngineVolume;
import by.itacademy.homework.homework333.cars.model.enums.common.Model;
import by.itacademy.homework.homework333.cars.model.enums.common.WheelSize;
import by.itacademy.homework.homework333.cars.showroom.Showroom;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Service service = new Service();
        Factory factory = new Factory(Color.values(), Model.values(), WheelSize.values(), EngineVolume.values());
        Showroom showroom = new Showroom(service, factory);

        showroom.printFactorySettings();

        Car car = showroom.orderCar(
            Model.AUDI_A4,
            EngineVolume.HIGH,
            Color.GREEN,
            WheelSize.SMALL,
            new HashSet<>()
        );
    }

}

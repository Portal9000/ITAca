package by.itacademy.homework.homework333.cars.factory.storages;

import by.itacademy.homework.homework333.cars.model.cars.PassengerCar;
import by.itacademy.homework.homework333.cars.model.enums.PassCapacity;                     // TODO
import by.itacademy.homework.homework333.cars.model.enums.common.Color;
import by.itacademy.homework.homework333.cars.model.enums.common.EngineVolume;
import by.itacademy.homework.homework333.cars.model.enums.common.Model;
import by.itacademy.homework.homework333.cars.model.enums.common.WheelSize;

import java.util.ArrayList;
import java.util.List;

public class PassengerStorage {

    private final List<PassengerCar> passengerCars = new ArrayList<>();

    public void addPassengerCarToPassengerStorage(PassengerCar passengerCar) {
        passengerCars.add(passengerCar);
    }

    public PassengerCar getPassengerCarFromPassengerStorage(Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, byte passengerСapacity) {
        PassengerCar passengerCar = null;
        int index = 0;
        for (int i = 0; i < passengerCars.size(); i++) {
            PassengerCar temp = passengerCars.get(i);
            if (temp.getModel() == model && temp.getEngineVolume() == engineVolume && temp.getPassengerСapacity() == passengerСapacity) {
                if (passengerCar == null) {
                    passengerCar = temp;
                    index = i;
                    continue;
                }
                if (temp.getColor() == color && passengerCar.getColor() != color) {
                    passengerCar = temp;
                    index = i;
                    continue;
                }
                if (temp.getWheelSize() == wheelSize && passengerCar.getWheelSize() != wheelSize) {
                    passengerCar = temp;
                    index = i;
                }
                // Add options check as well if needed.
            }
        }

        if (passengerCar != null) {
            passengerCars.remove(index);
        }
        return passengerCar;
    }

}

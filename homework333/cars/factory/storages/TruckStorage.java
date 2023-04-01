package by.itacademy.homework.homework333.cars.factory.storages;

import by.itacademy.homework.homework333.cars.model.cars.TruckCar;
import by.itacademy.homework.homework333.cars.model.enums.TruckCapacity;                     // TODO
import by.itacademy.homework.homework333.cars.model.enums.common.Color;
import by.itacademy.homework.homework333.cars.model.enums.common.EngineVolume;
import by.itacademy.homework.homework333.cars.model.enums.common.Model;
import by.itacademy.homework.homework333.cars.model.enums.common.WheelSize;

import java.util.ArrayList;
import java.util.List;

public class TruckStorage {

    private final List<TruckCar> truckCars = new ArrayList<>();

    public void addTruckCarToTruckStorage(TruckCar truckCar) {
        truckCars.add(truckCar);
    }

    public TruckCar getTruckCarFromTruckStorage(Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, short loadCapacity) {
        TruckCar truckCar = null;
        int index = 0;
        for (int i = 0; i < truckCars.size(); i++) {
            TruckCar temp = truckCars.get(i);
            if (temp.getModel() == model && temp.getEngineVolume() == engineVolume && temp.getLoadCapacity() == loadCapacity) {
                if (truckCar == null) {
                    truckCar = temp;
                    index = i;
                    continue;
                }
                if (temp.getColor() == color && truckCar.getColor() != color) {
                    truckCar = temp;
                    index = i;
                    continue;
                }
                if (temp.getWheelSize() == wheelSize && truckCar.getWheelSize() != wheelSize) {
                    truckCar = temp;
                    index = i;
                }
                // Add options check as well if needed.
            }
        }

        if (truckCar != null) {
            truckCars.remove(index);
        }
        return truckCar;
    }

}
package by.itacademy.homework.homework333.cars.factory.storages;

import by.itacademy.homework.homework333.cars.model.cars.SportCar;
import by.itacademy.homework.homework333.cars.model.enums.SportSpeed;                     // TODO
import by.itacademy.homework.homework333.cars.model.enums.common.Color;
import by.itacademy.homework.homework333.cars.model.enums.common.EngineVolume;
import by.itacademy.homework.homework333.cars.model.enums.common.Model;
import by.itacademy.homework.homework333.cars.model.enums.common.WheelSize;

import java.util.ArrayList;
import java.util.List;

public class SportStorage {

    private final List<SportCar> sportCars = new ArrayList<>();

    public void addSportCarToSportStorage(SportCar sportCar) {
        sportCars.add(sportCar);
    }

    public SportCar getSportCarFromSportStorage(Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, int fullSpeed) {
        SportCar sportCar = null;
        int index = 0;
        for (int i = 0; i < sportCars.size(); i++) {
            SportCar temp = sportCars.get(i);
            if (temp.getModel() == model && temp.getEngineVolume() == engineVolume && temp.getFullSpeed() == fullSpeed) {
                if (sportCar == null) {
                    sportCar = temp;
                    index = i;
                    continue;
                }
                if (temp.getColor() == color && sportCar.getColor() != color) {
                    sportCar = temp;
                    index = i;
                    continue;
                }
                if (temp.getWheelSize() == wheelSize && sportCar.getWheelSize() != wheelSize) {
                    sportCar = temp;
                    index = i;
                }
                // Add options check as well if needed.
            }
        }

        if (sportCar != null) {
            sportCars.remove(index);
        }
        return sportCar;
    }

}

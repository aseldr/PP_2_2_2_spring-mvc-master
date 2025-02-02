package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements web.service.CarService {
    @Override
    public List<Car> carsCount(int num) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", "XM", "Green"));
        carList.add(new Car("SKODA", "Octavia", "Blue"));
        carList.add(new Car("Ford", "Mustang", "Red"));
        carList.add(new Car("Tesla", "Model S", "Black"));
        carList.add(new Car("Toyota", "Camry", "White"));

        if (num <= 0) {
            return new ArrayList<>();
        } else if (num > carList.size()) {
            return carList;
        }
        return carList.subList(0, num);
    }
}
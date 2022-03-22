package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    public static List<Car> getCarList(int count) {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("Lada", "black", 1999));
        carsList.add(new Car("Lada", "golden", 2004));
        carsList.add(new Car("Honda", "silver", 2007));
        carsList.add(new Car("Toyota", "silver", 2012));
        carsList.add(new Car("Toyota", "olive", 2017));
        return carsList.stream().limit(count).toList();
    }
}

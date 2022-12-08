package web.service;

import web.module.Car;

import java.util.List;

public interface CarService {
    List<Car> getListCar(int count);
}

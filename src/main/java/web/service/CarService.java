package web.service;

import web.modul.Car;

import java.util.List;

public interface CarService {
    List<Car> getListCar(int count);
}

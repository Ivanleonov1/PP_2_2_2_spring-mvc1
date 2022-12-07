package DAO;

import modul.Car;

import java.util.List;

public interface CarDao {
    List<Car> getListCar(int count);
}

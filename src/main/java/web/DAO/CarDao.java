package web.DAO;

import web.modul.Car;

import java.util.List;

public interface CarDao {
    List<Car> getListCar(int count);
}

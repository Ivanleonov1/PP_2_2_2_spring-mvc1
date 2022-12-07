package service;

import DAO.CarDao;
import modul.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarDao carDao;
    @Override
    public List<Car> getListCar(int count) {
        return carDao.getListCar(count);

    }
}

package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.CarDao;
import web.module.Car;
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

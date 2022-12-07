package web.DAO;

import web.modul.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class CarDaoImpl implements CarDao{
        private static final List<Car> getListCar = new ArrayList<>();

        static {
            getListCar.add(new Car("Mercedes-Benz", "blake", "350"));
            getListCar.add(new Car("Lada", "white", "99"));
            getListCar.add(new Car("Land Cruiser", "white", "470"));
            getListCar.add(new Car("Volga", "blake", "3110"));
            getListCar.add(new Car("BMV", "silver", "6"));
        }

        @Override
        public List<Car> getListCar(int count) {
            if (count == 0) {
                return getListCar;
            }

            return getListCar.stream().limit(count).collect(Collectors.toList());
        }
    }


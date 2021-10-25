package web.dao;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class CarDAOImpl implements CarDAO {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            cars.add(new Car("model_" + i, i, 2021 + i));
        }
    }

    public List<Car> getOfCountCars(Integer count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }

}

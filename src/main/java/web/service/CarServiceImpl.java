package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDAOImpl;
import web.models.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    private final CarDAOImpl carDAO = new CarDAOImpl();

    @Override
    public List<Car> getOfCountCars(Integer count) {
        return carDAO.getOfCountCars(count);
    }
}

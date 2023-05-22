package web.dao;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarDaoImpl implements CarDao{

    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("BMW", "Sedan", "3"));
        cars.add(new Car("BMW", "GranTurismo", "6"));
        cars.add(new Car("BMW", "Cabriolet", "4"));
        cars.add(new Car("BMW", "Crossover", "X4"));
        cars.add(new Car("BMW", "SportsCar", "M"));
    }

    @Override
    public List<Car> index() {
        return cars;
    }
}

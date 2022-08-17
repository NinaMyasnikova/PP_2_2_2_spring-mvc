package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{
    private List<Car>listOfCars;
    {
        listOfCars = new ArrayList<>();
        listOfCars.add(new Car("brand1", "model1", 1));
        listOfCars.add(new Car("brand2", "model2", 2));
        listOfCars.add(new Car("brand3", "model3", 3));
        listOfCars.add(new Car("brand4", "model4", 4));
        listOfCars.add(new Car("brand5", "model5", 5));
    }
    @Override
    public List<Car> getAllCars() {
        return listOfCars;
    }

    @Override
    public List<Car> getAnyCars(int count) {
        return listOfCars.stream().limit(count).collect(Collectors.toList());
    }
}

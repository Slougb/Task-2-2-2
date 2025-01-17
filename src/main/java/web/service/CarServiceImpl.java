package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<Car>();
        cars.add(new Car("BMW", 3, "black"));
        cars.add(new Car("Audi", 4, "red"));
        cars.add(new Car("Honda", 5, "yellow"));
        cars.add(new Car("Mercedes Benz", 6, "green"));
        cars.add(new Car("Toyota Benz", 7, "blue"));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, count);
    }
}

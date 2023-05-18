package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "Sedan", "3"));
        cars.add(new Car("BMW", "GranTurismo", "6"));
        cars.add(new Car("BMW", "Cabriolet", "4"));
        cars.add(new Car("BMW", "Crossover", "X4"));
        cars.add(new Car("BMW", "SportsCar", "M"));
        cars = CarService.carsCount(cars, allCars);
        model.addAttribute("list", cars);
        return "car";
    }
}

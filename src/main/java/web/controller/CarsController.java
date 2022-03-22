package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")      // какой URL будет приходить в метод контроллера
    public String printCars(@RequestParam(defaultValue = "5") Integer count, ModelMap model) {
        CarService carService = new CarService();
        List<Car> cars = carService.getCarList(count);
        model.addAttribute("cars", cars);
        return "cars";                   // когда пользователь обратится по URL, он попадет в этот метод, а метод вернет представление
    }
}

package web.service;




import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;


@Service
public class CarService {

    private List<Car> cars = new ArrayList<>() ;

    public CarService() {

        cars.add(Car.builder()
                .Model("Tesla X")
                .Year(2020)
                .Engine(2.0)
                .build());
        cars.add(Car.builder()
                .Model("BMW")
                .Year(2023)
                .Engine(2.5)
                .build());
        cars.add(Car.builder()
                .Model("Volvo")
                .Engine(2.7)
                .Year(2022)
                .build());
        cars.add(Car.builder()
                .Model("Omoda")
                .Year(2023)
                .Engine(1.9)
                .build());
        cars.add(Car.builder()
                .Model("Zeekr")
                .Year(2022)
                .Engine(1.8)
                .build());
    }
    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }

}



package java8.examples;

import base.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaAndStream {
    //prior to Stream API
    public static List<Car> findCarsOldWay(List<Car> cars) {
        List<Car> selectedCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.kilometers() < 50000) {
                selectedCars.add(car);
            }
        }
        return selectedCars;
    }

    public static List<Car> findCarsByStream(List<Car> cars) {
        return cars.stream().filter(car -> car.kilometers() < 50000).collect(Collectors.toList());
    }
}

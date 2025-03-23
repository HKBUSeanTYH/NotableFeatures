package java8.examples;

import base.Car;

import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {
    @SuppressWarnings("Convert2MethodRef")
    public List<String> withoutMethodReference(List<Car> cars) {
        return cars.stream().map(car -> car.toString()).collect(Collectors.toList());
    }

    public List<String> withMethodReference(List<Car> cars) {
        return cars.stream().map(Car::toString).collect(Collectors.toList());
    }
}

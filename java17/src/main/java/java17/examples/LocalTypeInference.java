package java17.examples;

import base.Car;

import java.util.List;
import java.util.stream.Collectors;

public class LocalTypeInference {
    /*
        Java always needed explicit types on local variables. The var type allows us to omit type from the left-hand side of our statements.
        Java 11
     */

    public static void main(String[] args) {
        var audi = new Car("Audi", 10_000_000);
        var bmw = new Car("BMW", 5_000);
        var mercedes = new Car("Mercedes", 7_000);
        var cars = List.of(audi, bmw, mercedes);

        var filtered = cars.stream().filter((var x) -> x.kilometers() < 8_000).collect(Collectors.toList());
        System.out.println(filtered);
    }
}

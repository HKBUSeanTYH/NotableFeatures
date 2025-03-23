package java17.examples;

import base.Car;

import java.util.ArrayList;
import java.util.List;

public class JavaModuleSystemExports {
    /*
        Java 9 module system
        exporting the base class from java8 module and requiring java8 by java17
     */
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
    }
}

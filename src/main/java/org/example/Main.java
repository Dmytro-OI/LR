package org.example;

import car.Car;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Toyota", 2010, 1715, "EZ1447GG"));
        cars.add(new Car(2, "BMW", 2015, 15555, "BC7777CB"));
        cars.add(new Car(3, "Audi", 2012, 12505, "MC0505CM"));
        cars.add(new Car(4, "Toyota", 2018, 22777, "OP1715VO"));

        printCarsByModel(cars, "Toyota");
        printCarsByModelAndYears(cars, "Toyota", 5);
        printCarsByYearAndPrice(cars, 2012, 10000);
    }

    public static void printCarsByModel(List<Car> cars, String model) {
        System.out.println("Автомобілі моделі " + model + ":");
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(model)) {
                System.out.println(car);
            }
        }
    }

    public static void printCarsByModelAndYears(List<Car> cars, String model, int years) {
        System.out.println("Автомобілі моделі " + model + ", які експлуатуються більше " + years + " років:");
        int currentYear = 2024;
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(model) && (currentYear - car.getYear()) > years) {
                System.out.println(car);
            }
        }
    }

    public static void printCarsByYearAndPrice(List<Car> cars, int year, double price) {
        System.out.println("Автомобілі, випущені в " + year + " році, ціна яких більше " + price + ":");
        for (Car car : cars) {
            if (car.getYear() == year && car.getPrice() > price) {
                System.out.println(car);
            }
        }
        }
    }


package day34_abstraction.carTask;

import day34_abstraction.carTask.AutoPark;
import day34_abstraction.carTask.Car;

public class Mercedes extends Car implements AutoPark {

    public Mercedes(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }


    @Override
    public void autoPark() {
        System.out.println(getMake() + " "+ getModel() + " is self parking in the parking lot");

    }

    @Override
    public void start() {
        System.out.println(getMake() + " "+ getModel() + " is starting");

    }

    @Override
    public void drive() {
        System.out.println(getMake() + " "+ getModel() + " is driving");

    }





}

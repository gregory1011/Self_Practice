package day34_abstraction.carTask;

import day34_abstraction.carTask.AutoPilot;
import day34_abstraction.carTask.Car;

public class Tesla extends Car implements AutoPilot {

    public Tesla(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " "+ getModel() + " has self drive mode.");

    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " "+ getModel() + " is self parking anywhere");

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

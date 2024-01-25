package day34_abstraction.carTask;

public class CydeoCar extends Car implements AutoPilot, Flyable {

    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }


    @Override
    public void selfDrive() {
        System.out.println(getMake() + " "+ getModel() + " has self drive mode");
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " "+ getModel() + " is auto parking in driveway");

    }

    @Override
    public void start() {
        System.out.println(getMake() + " "+ getModel() + " is starting");

    }

    @Override
    public void drive() {
        System.out.println(getMake() + " "+ getModel() + " is driving");

    }

    @Override
    public void fly() {
        System.out.println(getMake() + " "+ getModel() + " has fly mode.");

    }




}

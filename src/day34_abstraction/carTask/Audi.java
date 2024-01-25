package day34_abstraction.carTask;

public class Audi extends Car implements AutoPark {

    public Audi(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }


    @Override
    public void autoPark() {
        System.out.println(getMake() + " "+ getModel() + " is self parking in garage.");

    }

    @Override
    public void start() {
        System.out.println(getMake() + " "+ getModel() + " is starting");

    }

    @Override
    public void drive() {
        System.out.println(getMake() + " "+ getModel() + " is driving on the road.");

    }




}

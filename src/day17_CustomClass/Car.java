package day17_CustomClass;

public class Car {
    public String make, model, color;
    int year;
    double price;

    public void CarSetInfo(String make, String model, String color, int year, double price ){
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public String toString() {
        return "car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public void start(){
        System.out.println(make + " is a good car");
    }
}

package day34_abstraction.carTask;

public abstract class Car {

    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        if (make == null ){
            System.err.println("Make of the car can not be null.");
            System.exit(1);
        }
        if (make.isEmpty() ){
            System.err.println("Make of the car  can not be empty.");
            System.exit(1);
        }

        this.make = make;

        if (model == null ){
            System.err.println("Model of the car can not be null.");
            System.exit(1);
        }
        if (model.isEmpty() ){
            System.err.println("Model of the car can not be empty.");
            System.exit(1);
        }

        this.model = model;

        if ( year < 1886){
            System.err.println("Year of the car can not be less then 1886");
        }

        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(double price) {
        if (price < 0){
            System.err.println("Price can not be negative.");
            System.exit(1);
        }
        this.price = price;
    }

    public void setColor(String color) {
        if (color == null ){
            System.err.println("Invalid color. Color can not be null!");
            System.exit(1);
        }
        this.color = color;
    }


    public abstract void  start();
    public abstract void drive();

    public void stop(){
        System.out.println(make+ " "+ model +" is stopping.");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }




}

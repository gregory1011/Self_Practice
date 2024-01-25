package day34_abstraction.deviceTask;

public abstract class Device {

    private final String brand, model;
    public  double price;
    public String  color;
    private final String size;
    private boolean hasBattery;
    private boolean hasPowerButton;

    public Device(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        if (brand == null ){
            System.err.println("Brand of the can can not be null");
            System.exit(1);
        }else if (brand.isEmpty()){
            System.err.println("Brand of the car can not be empty");
            System.exit(1);
        }
        this.brand = brand;
        if (model == null ){
            System.err.println("Brand of the can can not be null");
            System.exit(1);
        }else if (model.isEmpty()){
            System.err.println("Brand of the car can not be empty");
            System.exit(1);
        }
        this.model = model;

        setPrice(price);
        setColor(color);

        if (size == null ){
            System.err.println("Brand of the can can not be null");
            System.exit(1);
        }else if (size.isEmpty()){
            System.err.println("Brand of the car can not be empty");
            System.exit(1);
        }
        this.size = size;

        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if ( price <= 0){
            System.err.println("Price can not be zero or negative");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if ( color.isEmpty()){
            System.err.println("Color of the car can not be empty");
            System.exit(1);
        }else if ( color == null ){
            System.err.println("Error");
            System.exit(1);
        }else {
            this.color = color;
        }
    }

    public String getSize() {
        return size;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }


    public abstract void turnOn();
    public abstract void turnOff();

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                '}';
    }



}

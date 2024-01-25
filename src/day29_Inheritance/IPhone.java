package day29_Inheritance;

public class IPhone {
    private String brand;
    private String model;
    private  String size;
    private double price;
    private String color;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if ( brand.isEmpty() || brand.isBlank() || brand == null){
            System.err.println("Brand can not be null");
            System.exit(1);
        }else {

            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank() || model.isEmpty()) {
            System.err.println("Model can not be null");
            System.exit(1);
        } else {
            this.model = model;
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if ( price <= 0 ){
            System.err.println("Price can not be zero or negative");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if ( color == null || color.isEmpty() || color.isBlank()) {
            System.err.println("Color can not be null");
            System.exit(1);
        }else {
            this.color = color;
        }
    }

    public void setInfo(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public String call( long phoneNumber){
       return "Phone " + model + " is calling " + phoneNumber;
    }

    public String text( long phoneNumber){
        return "Phone " + model + " is texting " + phoneNumber;
    }

    public String faceTime( long phoneNumber){
        return "Phone " + model + " is FaceTiming " + phoneNumber;
    }

    public String faceTime( String email){
        return "Phone " + model + " is FaceTiming " + email;
    }




    public String toString() {
        return "IPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                ", color='" + color + '\'' +
                '}';
    }




}

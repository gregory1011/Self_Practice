package day29_Inheritance;

public class Samsung {

    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = brand;
        } else {
            System.err.println("Brand can not be null");
            System.exit(1);
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()){
            this.model =model;
        }else{
            System.err.println("Model can not be null");
            System.exit(1);
        }

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if ( size == null || size.isBlank() || size.isEmpty()){
            this.size = size;
        }else {
            System.err.println("Size can not be null");
            System.exit(1);
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if ( price < 0){
            System.err.println("Price can not be Zero or Negative");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if ( color == null || color.isEmpty() || color.isBlank()){
            this.color = color;
        }else {
            System.err.println("Color can not be null");
        }

    }

    public void setInfo(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public void call (long phoneNumber){
        System.out.println(brand + " is calling " + phoneNumber);
    }

    public void text (long phoneNumber){
        System.out.println(brand +" model " + model + " is texting " + phoneNumber);
    }

    public void freeze (){
        System.out.println(brand + " "+ model + " freezing");
    }

    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                ", color='" + color + '\'' +
                '}';
    }




}

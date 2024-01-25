package day27_Static;

public class Iphone {

    public static String brand;
    public String model, size, color;
    public double price;
    public  static String OS;
    public static boolean isSmartPhone;
    public static String madeIn, designIn;

    public Iphone(String model, String size, String color, double price) {

        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;

    }

    static {

        brand ="Apple";
        OS = "IOS";
        isSmartPhone = true;
        madeIn ="China";
        designIn = "California";

    }

    public static void printOperatingSystem(){
        System.out.println("Operating system is: "+ OS);
    }

    public void call (long phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }

    public void text (long phoneNumber){
        System.out.println("Texting "+ phoneNumber);
    }

    public void faceTime ( long phoneNumber){
        System.out.println("FaceTiming "+ phoneNumber);
    }

    public void faceTime (String email){
        System.out.println("FaceTiming "+ email);
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }


}

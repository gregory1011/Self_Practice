package day04_concatenation;

public class CarInfo {
    public static void main(String[] args) {
        String make = "Toyota",
                model = "Camry",
                color = "Red";
        int miles = 500000,
                year = 2018,
                price = 19000;

        System.err.println("Car information is:"+"\n\t"+year+" "+make+" "+model+", "+miles+" miles, "+ color+" $"+price+".");
    }
}

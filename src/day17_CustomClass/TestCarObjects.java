package day17_CustomClass;

public class TestCarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.CarSetInfo("Lexus", "RX200", "White", 2019, 40500);
        System.out.println(car1);
        car1.start();
    }
}

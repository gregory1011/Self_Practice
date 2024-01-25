package day28_encapsulation;

public class TestCandyObjects {
    public static void main(String[] args) {

        Candy num1 = new Candy("KitKat", 5, 1.2, true);

        System.out.println(num1);

        Candy num2 = new Candy("Oreo", 2, 0, false);

        System.out.println(num2);
        num2.getPrice();

    }
}

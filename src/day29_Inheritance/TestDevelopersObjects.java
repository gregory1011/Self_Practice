package day29_Inheritance;

public class TestDevelopersObjects {
    public static void main(String[] args) {

        Developer num1 = new Developer();
        num1.setInfo("Jora", 'M', 32, "A32", "Developer", 85000, "Java");

        System.out.println(num1);

        num1.coding();



    }
}

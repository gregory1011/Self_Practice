package day26_Constructor;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person num1 = new Person("Jora", 28, 'M');
        System.out.println(num1);

        num1.eat("Ice Cream");
        num1.drink("Coca Cola");
        num1.sleep();

        Person.printIsHuman();
        Person.printNumberOfHead();
        Person.printHasNose();
        Person.printNumberOfEyes();
        Person.printHasWings();







    }
}

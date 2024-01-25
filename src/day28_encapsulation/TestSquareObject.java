package day28_encapsulation;

public class TestSquareObject {
    public static void main(String[] args) {

        Square ob = new Square();
        ob.setSide(5);
        System.out.println(ob);

        Square ob1 = new Square();
        ob1.setSide(-5);
        System.out.println(ob1);

    }
}

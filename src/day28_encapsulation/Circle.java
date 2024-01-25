package day28_encapsulation;

public class Circle {

    private double radius;

    public static double pi = 3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius(){
        if (radius == 0 || radius <= 0 ){
            System.err.println("Invalid number");
            System.exit(1);
        }
        return getRadius();
    }

    public void setRadius(double radius){
        if (radius < 0 ){
            System.err.println("Invalid number argument "+ radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    public double calcArea(){
        return pi * radius * radius;
    }

    public double calcPerimeter (){
        return 2 * pi * radius;
    }

    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                " area = " + calcArea() +
                " perimeter = " + calcPerimeter() +
                '}';
    }
}

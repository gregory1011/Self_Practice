package day26_Constructor;

public class Circle {

    public double radius, diameter;
    public static double pi = 3.14;

    public Circle (double radius) {
        this.radius = radius;
        diameter = radius * 2;
    }


    public double calcArea(){
        double area = pi * (radius * radius);
        return area;
    }

    public double calcPerimeter(){
        double perimeter = diameter * pi;
        return perimeter;
    }

    public static void printPi (){
        System.out.println("PI value = "+ pi);
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }



}

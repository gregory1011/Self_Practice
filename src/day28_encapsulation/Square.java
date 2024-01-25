package day28_encapsulation;

public class Square {

    private double side;

    public double getSide() {

        return side;
    }

    public void setSide(double side) {
        if (side <0) {
            System.err.println("Negative numbers are not allowed");
            System.exit(1);
        }
        this.side = side;

    }

    public double calcArea( ){
        return side * side;
    }

    public double calcPerimeter (){
        return side * 4;
    }

    public String toString() {
        return "Square{" +
                "side= " + side +
                " area= " + calcArea() +
                " perimeter= " + calcPerimeter() +
                '}';
    }
}

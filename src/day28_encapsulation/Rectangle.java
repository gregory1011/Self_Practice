package day28_encapsulation;

public class Rectangle {

    private double width, length;

    public Rectangle(double width, double length) {
        setLength(length);
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <0){
            System.err.println("Negative numbers are not allowed.");
            System.exit(1);
        }
        this.width = width;
    }

    public double getLength() {
        if (length < 0 ){
            System.err.println("Negative length");
            System.exit(0);
        }

        return length;
    }

    public void setLength(double length) {
        if (length < 0 ){
            System.err.println("Negative numbers are not allowed.");
            System.exit(1);
        }
        this.length = length;
    }

    public double calcArea(){
        return width * length;
    }
    public  double calcPerimeter(){
        return (length + width) * 2;
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}

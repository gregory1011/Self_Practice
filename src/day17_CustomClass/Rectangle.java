package day17_CustomClass;

public class Rectangle {
    public double length, width;

    public void setInfo (double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        double area = width * length;
        return area;
    }

    public double calculatePerimeter(){
        double perimeter = ( length + width ) * 2;
        return perimeter;
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                " area=" + calculateArea() +
                ", perimeter=" + calculatePerimeter() +
                '}';
    }
}

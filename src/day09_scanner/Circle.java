package day09_scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter the radius of the circle");
        double radius = input.nextDouble();


        double areaCircle = 3.14* radius;
        double perimeterCircle = 2*3.14 *radius;

        System.out.println("perimeterCircle = " + perimeterCircle);
        System.out.println("areaCircle = " + areaCircle);
        input.close();


    }
}

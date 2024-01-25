package day16_nestedLoops;

import java.util.Scanner;

public class AreaAndPerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {

            System.out.println("Enter the length of the Rectangle:");
            double length = input.nextDouble();

            while (length < 0) {
                System.out.println("Invalid Entry for the length of the rectangle");
                length = input.nextDouble();
            }

            System.out.println("Enter the width of the Rectangle:");
            double width = input.nextDouble();

            while (width < 0) {
                System.out.println("Invalid Entry for the width of the rectangle");
                width = input.nextDouble();
            }

            double area = length * width;
            double perimeter = 2 * (length + width);
            System.out.println("1. Area of rectangle = " + area);
            System.out.println("2. Perimeter of rectangle = " + perimeter);

            System.out.println("Would you like to calculate another Rectangle? Yes/No");
            String answer = input.next().toLowerCase();


            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid entry. Would you like to calculate another Rectangle? Yes/No");
                answer = input.next().toLowerCase();
            }

            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo Rectangle Calculator APP");

            }
        }
    }
}

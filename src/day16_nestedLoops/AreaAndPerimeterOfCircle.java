package day16_nestedLoops;

import java.util.Scanner;

public class AreaAndPerimeterOfCircle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        while(true) {
            System.out.println("Enter radius of the circle:");
            double radius = input.nextDouble();


        while( (radius < 0)){
            System.err.println("Invalid Entry for the radius of the circle");
            radius = input.nextDouble();
        }

        double diameter = 2 * radius;
        double area = 3.14 * radius * radius;
        double perimeter = 2 * area;

            System.out.println("1. Diameter of circle = " + diameter);
            System.out.println("2. Area of circle = "+ area);
            System.out.println("3. Perimeter of circle = "+ perimeter);

            System.out.println();
            System.out.println("Would you like to calculate another circle? Yes/No");
            String answer = input.next().toLowerCase();

            while ( ! (answer.equals("yes") || answer.equals("no")) ){
                System.out.println("Invalid entry. Would you like to calculate another circle? Yes/No");
            answer= input.next().toLowerCase();
            }

            if (answer.equals("no")){
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                return;
            }
        }




    }
}

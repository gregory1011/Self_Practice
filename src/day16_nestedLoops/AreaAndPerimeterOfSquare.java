package day16_nestedLoops;

import java.util.Scanner;

public class AreaAndPerimeterOfSquare {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {


            System.out.println("Enter the side of the square:");
            double side = input.nextDouble();

            while (side < 0) {
                System.err.println("Invalid Entry for the side of the square");
                side = input.nextDouble();
            }

            double area = side * 2;
            double perimeter = side * 4;
            System.out.println("1. Area of square = "+ area);
            System.out.println("2. Perimeter of square ="+ perimeter);

            System.out.println("Would you like to calculate another Square? Yes/No");
            String answer = input.next().toLowerCase();

            while ( ! (answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid entry. Would you like to calculate another Square? Yes/No");
                answer = input.next().toLowerCase();
            }

            if (answer.equals("no")){
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                return;
            }
        }

    }

}

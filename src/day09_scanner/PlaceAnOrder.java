package day09_scanner;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.println("Enter name ");
        String productName = input.nextLine();

        System.out.println("Enter price ");
        double price = input.nextDouble();

        System.out.println("Enter quantity ");
        int quantity = input.nextInt();

        System.out.println("Enter first name ");
        String firstName = input.next();

        double cost = price * quantity;


        System.out.println(firstName+", you order for "+quantity+" "+productName+
                " has been places. Your total is $"+cost);

        input.close();
    }
}

package day15_Loops;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String user = input.next();
        System.out.println("Enter your password");
        String pass = input.next();

        if (user.equals("Cydeo") && pass.equals("Cydeo123")) {
            System.out.println("Logged in.");
        } else {

            for (int i = 0; i < 3; i++) {
                System.out.println("Invalid credentials, please try again");

                System.out.println("Enter your username");
                user = input.next();
                System.out.println("Enter your password");
                pass = input.next();

                if ((user.equals("Cydeo") && pass.equals("Cydeo123"))) {
                    System.out.println("Logged in.");
                    break;   // exits the loop
                }

            }
            if (!(user.equals("Cydeo") && pass.equals("Cydeo123"))) {
                System.err.println("Your account is lucked.");
            }


        }

        input.close();

    }

}

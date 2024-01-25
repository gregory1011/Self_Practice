package day09_scanner;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number:");
        double num1 = input.nextDouble();

        System.out.println("Enter a match operator");
        char operator = input.next().charAt(0);

        System.out.println("Enter your second number:");
        int num2 = input.nextInt();

        String result ="";

        if (operator == '+' || operator == '-' || operator =='*' || operator =='/'){

            if (operator == '+'){
                System.out.println(num1 + num2);
            } else if ( operator == '-'){
                System.out.println(num1-num2);
            }else if( operator=='*'){
                System.out.println(num1*num2);
            }else if(operator== '/'){
                System.out.println(num1/num2);
            }else{
                System.out.println("Invalid entry");
            }

            System.out.println();

            input.close();

        }

    }

}

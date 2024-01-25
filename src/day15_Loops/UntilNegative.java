package day15_Loops;

import java.util.Scanner;

public class UntilNegative {
    public static void main(String[] args) {

        int num = 0,
            sum = 0;

        Scanner input = new Scanner(System.in);

        while ( (num >= 0) ){
            System.out.println("Enter a positive number");
             num = input.nextInt();

            if ( num < 0 ){
                System.out.println("You entered a negative number");
                break;
            }else {
                sum += num;
            }

        }

        input.close();

        System.out.println("sum = " + sum);


    }
}

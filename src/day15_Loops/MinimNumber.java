package day15_Loops;

import java.util.Scanner;

public class MinimNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int  min = 2147483647;

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter the minimum number:");
            int num = input.nextInt();

            if(num < min){
                min = num;
            }

        }

        System.out.println("The minimum number is: " + min);
        input.close();

    }
}

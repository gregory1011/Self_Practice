package day15_Loops;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2147483648;

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter the number:");
            int num = input.nextInt();

            if (num > max){
                max = num;
            }

        }
        System.out.println("The maxim number is: "+ max);
        input.close();
    }
}

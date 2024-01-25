package day15_Loops;

import java.util.Scanner;

public class MinimAndMaximNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = 2147483647,
                max = -2147483648;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter all numbers:");
            int num = input.nextInt();

            if(num < min){
                min = num;
            }
            if (num > max){
                max = num;
            }
        }
        System.out.println("The minimum number is: "+ min);
        System.out.println("The maximum number is: "+ max);
        input.close();
    }


}

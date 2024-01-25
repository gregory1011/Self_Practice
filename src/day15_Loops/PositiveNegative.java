package day15_Loops;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int positive = 0,
            negative = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your number");
            int number = input.nextInt();

            if ( number > 0 ){
                positive++;
            }else if(number < 0 ){
                negative++;
            }
        }
        input.close();
        System.out.println(positive + " positive and "+ negative +" negative");



    }
}

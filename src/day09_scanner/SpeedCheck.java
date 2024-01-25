package day09_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the current speed");
        int currentSpeed = input.nextInt();
        int speedLimit = 55;
        int overLimit = currentSpeed - speedLimit;
        if (currentSpeed > speedLimit){
            System.out.println("You are driving "+overLimit+" mph over limit. Slow down!");
        }
                input.close();


        input.close();
    }
}

package day09_scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score: ");
        int score = input.nextInt();

        String result = (score >= 90 && score <=100)? "A"
                :(score >= 80 && score <=89)? "B"
                :(score >= 70 && score <=79)? "C"
                :(score >= 60 && score <=69)? "D"
                : "Invalid Score";

        System.out.println("result = " + result);

        input.close();

    }
}

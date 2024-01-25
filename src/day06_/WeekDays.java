package day06_;

public class WeekDays {
    public static void main(String[] args) {
       int n = 4;
       String result = "";
       if (n ==1 ){
           result = "Monday";
       }
       if (n >= 2){
           result = " Tuesday";
       }
       if (n == 3){
           result="Wednesday";
       }
       if(n == 4){
           result="Thursday";
       }
        if (n == 5) {
            result = "Friday";
        }
        if (n == 6){
            result = "Saturday";
        }
        if (n == 7);{
            result = "Sunday";
        }

        System.out.println(result);

    }
}
/*
1. Create a class named WeekDays.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the day that the number represents

Ex:
Given:
number = 1

output:
Monday

Hint: Assume that a number between 1 ~ 7 is given to the variable
 */
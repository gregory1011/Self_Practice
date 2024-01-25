package day04_concatenation;

public class SwapTwoVariables_1 {
    public static void main(String[] args) {

        int x = 10,
                y = 15;
        int z = x;
         x = y;
         y=x;


        x= 15;
        y = 10;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
/*
Write a program that swap variables x & y’ values without using any temporary variables
        Ex:
              x = 10
              y = 15

        output:
                  x = 15
                  y = 10
 */

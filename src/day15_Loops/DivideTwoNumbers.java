package day15_Loops;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int num1 = 2,
            num2 = 5,
            num3 = 0;

        while ( num1 >= num2 ){
            num1 -= num2;
            num3++;
        }

        System.out.println("result: " +num3);
    }
}

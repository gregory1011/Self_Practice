package day06_;

public class MaximumNumber {
    public static void main(String[] args) {
      int n1 = 10,
           n2 = 20;
      if(n1 > n2){
          System.out.println(n1+ " is the maximum number");   // false
      }
      if (n2 >n1){
          System.out.println(n2+" is the maximum number"); // true
      }
      if (n1==n2){
          System.out.println("Equal");  // false
      }
    }
}
/*
1. Create a class named MaximumNumber.java
2. Declare the following variables:

1. num1
2. num2

3. Write a program that can print the maximum number between the
two numbers above, if both are equal then print Equal

Ex:

num1 = 10
num2 = 20

output:
20 is the maximum number
 */
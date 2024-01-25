package day09_scanner;

import java.util.Scanner;

public class AskPeople {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("How many people do they live with");

        int num =input.nextInt();
        String result ="";

        if (num >=0 && num <=2){
            result = "Live with less than 3 people";
        }else if(num >=3 && num <=6){
            result= "Live with 3 - 6 people";
        }else{
            result = "Live with more than 6 people" ;
        }
        System.out.println(result);
        input.close();    }
}

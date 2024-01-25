package day15_Loops;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sequence of characters:");
        String str = input.nextLine();

        System.out.println("Enter a character:");
        char letter = input.next().charAt(0);

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
             char count = str.charAt(i);

             if(count == letter){
                 frequency++;
             }
        }
        input.close();

        System.out.println("the frequency of Char is: "+frequency);




    }
}

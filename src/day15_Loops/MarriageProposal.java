package day15_Loops;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Will you marry me ? Yes/No");

        String answer = input.next().toLowerCase();

        while ( ! (answer.equals("yes") || answer.equals("no") ) ){
            System.out.println("Invalid answer, please re-enter");
            answer = input.nextLine().toLowerCase();
        }
        if(answer.equals("yes")){
            System.out.println("Congrats!");
        }else{
            System.out.println("Goodbye");
        }

        input.close();

    }
}

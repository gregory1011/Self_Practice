package day19_Arrays;

import java.util.Arrays;

public class classMates {
    public static void main(String[] args) {

        String[] classMates = { "Grigore Rosca", "Ruslan Babana", "Jora Tufea", "Ghita Monea"};

        for (int i = 0; i < classMates.length; i++) {

       String initial = classMates[i].charAt(0)+ "."+ classMates[i].charAt(  classMates[i].indexOf(" ") + 1 );

            System.out.println(initial);
        }


    }
}

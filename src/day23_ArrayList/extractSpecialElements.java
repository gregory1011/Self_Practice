package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class extractSpecialElements {
    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specialChar = new ArrayList<>();

        for ( char each : str.toCharArray()) {

            if (Character.isLetter(each)) {
                letters.add(each);
            } else if (Character.isDigit(each)) {
                digits.add(each);
            } else {
                specialChar.add(each);
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChar = " + specialChar);



    }
}

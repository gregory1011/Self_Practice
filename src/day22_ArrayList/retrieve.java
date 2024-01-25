package day22_ArrayList;

import java.util.ArrayList;

public class retrieve {
    public static void main(String[] args) {

        String str = "Wooden Spoon!";
        str = str.replace(" ", "");

        ArrayList<Character> letter = new ArrayList<>();
        ArrayList<Character> specialChar = new ArrayList<>();
        ArrayList<Character> digit = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)){
               letter.add(ch);
            }else if (Character.isDigit(ch)){
                digit.add(ch);
            }else {
                specialChar.add(ch);
            }

        }

        System.out.println("letter = " + letter);
        System.out.println("specialChar = " + specialChar);
        System.out.println("digit = " + digit);




    }
}

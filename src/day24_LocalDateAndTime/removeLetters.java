package day24_LocalDateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class removeLetters {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));
        System.out.println(list);

        list.removeIf(each -> Character.isLetter(each));
        System.out.println(list);



    }
}

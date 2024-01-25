package day24_LocalDateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class firstAndLstChar {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>(Arrays.asList
                ("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));
        System.out.println(list);


        list.removeIf ( each -> Character.toLowerCase(each.charAt(0)) ==
                Character.toLowerCase(each.charAt(each.length() - 1)));

        System.out.println(list);

    }
}

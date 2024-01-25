package day24_LocalDateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class uniqElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,3,4,5,5));
        System.out.println(list);

        list.removeIf( uniq -> list.indexOf(uniq) != list.lastIndexOf(uniq));

        System.out.println(list);


    }
}

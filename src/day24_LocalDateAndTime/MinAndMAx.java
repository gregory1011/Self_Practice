package day24_LocalDateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinAndMAx {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));
        System.out.println(list);

       int max = Collections.max(list);
       int min = Collections.min(list);

       list.removeIf( num -> num == max || num == min);
        System.out.println(list);

        int secondMax = Collections.max(list);
        int secondMin = Collections.min(list);

        list.removeIf( num -> num ==secondMax || num == secondMax);

        System.out.println("Second minim number is = " + secondMin);
        System.out.println("Second maxim number is = " + secondMax);





    }
}

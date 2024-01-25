package day22_ArrayList;

import java.util.ArrayList;

public class MinAndMaxNumber {
    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5};

        ArrayList <Integer> list = new ArrayList<>();

        for (int each : numbers) {
            list.add(each);
        }
        System.out.println(list);

        int min = list.get(0);
        int max = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min)
                min = list.get(i);

            if (list.get(i) > max)
                max = list.get(i);
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }
}

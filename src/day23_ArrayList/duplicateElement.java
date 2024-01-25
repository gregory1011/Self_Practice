package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class duplicateElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list);

        ArrayList<Integer> duplicates = new ArrayList<>();

        for (Integer each : list) {
            duplicates.add(each);
        }
        for (Integer each : list) {
            duplicates.add(each);
        }

        System.out.println(duplicates);

    }
}

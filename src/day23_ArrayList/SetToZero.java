package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SetToZero {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list);

        list.set(4, 0);
        System.out.println(list);



    }
}

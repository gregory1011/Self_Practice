package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class multiplyByTwo {
    public static void main(String[] args) {

        ArrayList< Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list);

        ArrayList<Integer> newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if ( (list.get(i) % 2) != 0){
                newList.add(list.get(i) * 2);
            }else {
                newList.add(list.get(i));
            }
        }
        System.out.println(newList);

    }
}
/*
write a program that can multiply each odd number by 2
                ex: list = [1,2,3,4,5];
                    output: [2,2,6,4,10]

 */
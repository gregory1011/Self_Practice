package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class removeNames {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"));

        list.removeIf(name -> name.equals("Ahmed"));
        System.out.println(list);


    }
}

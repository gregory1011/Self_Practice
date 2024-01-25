package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class moveAllZeros {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(list);

        int zero= 0;
        for (int i = 0; i < list.size(); i++) {

            if(list.get(i) == 0){
                list.remove(i);
                zero++;
                i--;
            }
        }
        for (int i = 0; i < zero; i++) {
            list.add(0);
        }

        System.out.println(list);
    }
}

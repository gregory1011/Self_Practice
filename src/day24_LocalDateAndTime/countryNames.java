package day24_LocalDateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class countryNames {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Azerbaijan", "Turkmenistan", "Indonesia", "China", "USA" ));
        System.out.println(list);

        list.removeIf( each -> each.length() >= 10 );

        System.out.println(list);



    }
}

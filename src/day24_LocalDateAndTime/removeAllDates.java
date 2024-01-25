package day24_LocalDateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;

public class removeAllDates {
    public static void main(String[] args) {

        ArrayList<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(2008, 8,10));
        System.out.println(dates);

        dates.removeIf( date -> date.isBefore(LocalDate.of(2016,8,15)));

        System.out.println(dates);




    }
}

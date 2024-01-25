package day24_LocalDateAndTime;

public class LeapYear {
    public static void main(String[] args) {

        System.out.println(leapYear(2018));
        System.out.println(leapYear(2020));
        System.out.println(leapYear(2023));

    }
    public static boolean leapYear(int year){
        return (year %4 == 0);
    }
}

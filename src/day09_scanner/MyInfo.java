package day09_scanner;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Enter your gender");
        String gender = input.next();
        input.nextLine();
        System.out.println("Enter your full name");
        String fullName = input.nextLine();
        System.out.println("Enter your phone number");
        long cellNumber = input.nextLong();;
        System.out.println("Enter you zip code");
        int zipCode = input.nextInt();
        input.nextLine();
        System.out.println("Enter your school name");
        String schoolName = input.nextLine();
        System.out.println("Enter city name");
        String cityName = input.nextLine();
        System.out.println("Enter state name");
        String stateName = input.next();
        System.out.println("Enter building number");
        int buildingNumber = input.nextInt();
        input.nextLine();
        System.out.println("Enter street name");
        String streetName = input.nextLine();

        System.out.println("1. "+fullName);
        System.out.println("2. "+age);
        System.out.println("3. "+gender);
        System.out.println("4. "+cellNumber);
        System.out.println("5. address: " +"\n\t\t "+buildingNumber+" "+streetName+
                "\n\t\t "+cityName+", "+stateName+" "+zipCode+"\n6."+ schoolName);

        input.close();






    }
}

package day07_If_statements;

public class AgeGroups {

    public static void main(String[] args) {

        String result ="";
        int age = 154;

        if ( age >= 1 && age <= 21 || age >= 22 &&
                age  <= 55 || age >= 56 && age <=150) {
            if (age >= 1 && age <=20) {
                result = "Teenager";
            } else if (age >= 21 && age < 55) {
                result = "Adult";
            } else {
                result = "Senior";
            }
        }else {
            result= "Invalid";
        }
        System.out.println(result);
    }

}




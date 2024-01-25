package day22_ArrayList;

public class UpperAndLowerCase {
    public static void main(String[] args) {

        String str ="JAVA java";

        int upperCase = 0;
        int lowerCase = 0;

        for (char each : str.toCharArray()){
            if(Character.isUpperCase(each)){
                upperCase++;
            } else if (Character.isLowerCase(each)) {
                lowerCase++;
            }else {
                continue;
            }
        }

        System.out.println(upperCase == lowerCase);


    }
}

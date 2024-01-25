package day07_If_statements;

public class GradeLevel {
    public static void main(String[] args) {
        int grade = 11;
        String result ="";

        if (grade >=1 && grade<=5 || grade >= 6 && grade <= 8 ||
            grade >= 9 && grade <=12 || grade >=13 && grade <= 16 || grade >= 17 && grade<=18){
            if (grade >=1 && grade<= 5){
                result = "Elementary School";
            }else if ( grade >= 6 && grade <= 8){
                result="Middle School";
            }else if( grade >= 9 && grade <= 12){
                result="High School";
            }else if ( grade >= 13 && grade <= 16){
                result ="College";
            }else {
                result=" Grad School";
            }
        }else {
            result ="Invalid Grade Level";
        }
        System.out.println(result);

    }
}

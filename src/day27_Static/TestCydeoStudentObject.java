package day27_Static;

public class TestCydeoStudentObject {
    public static void main(String[] args) {

       CydeoStudent student1 =
               new CydeoStudent("Jora", 'M', 23, "A29", "B12", "SDET") ;

        System.out.println(student1);
        CydeoStudent.printSecretCode();

        student1.study();
        student1.attendClass();
        System.out.println(student1.age);



    }
}

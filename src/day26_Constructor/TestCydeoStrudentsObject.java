package day26_Constructor;

public class TestCydeoStrudentsObject {

    public static void main(String[] args) {

        CydeoStudent students = new CydeoStudent("Jora", "B29", "A12",
                "Junior", 29, 29, 'M');

        System.out.println(students);


        students.attendClass();
        students.study();

        CydeoStudent.printSchoolName();
        CydeoStudent.printProgLanguage();




    }

}

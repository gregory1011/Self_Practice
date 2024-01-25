package day31_inhiritance.studentTask;

public class TestStudentObjects {
    public static void main(String[] args) {

        GraduateStudent grad = new GraduateStudent("Jora", 23, 'M', "A12",
                "Computer Science", 'C', "NEU");
        System.out.println(grad);
        grad.study();


        UndergraduateStudent under = new UndergraduateStudent("Florea", 22, 'M', "B11",
                "Engineering", 'D', "Simson University");
        System.out.println(under);
        under.study();


        CydeoStudent cydeo = new CydeoStudent("Greg", 29, 'M', "B29",
                "Software engineer", 'A', "Cydeo school", 29,
                "Java", 11);
        System.out.println(cydeo);
        cydeo.study();

    }
}

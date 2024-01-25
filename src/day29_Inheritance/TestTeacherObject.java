package day29_Inheritance;

public class TestTeacherObject {
    public static void main(String[] args) {

        Teacher num1 = new Teacher();
        num1.setInfo("Muhtar", 'M', 33, "S44", "Java instructor", 130000);

        System.out.println(num1);

        num1.teaching();

    }
}

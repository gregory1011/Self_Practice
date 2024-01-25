package day18_GarbageColletion;

public class TestContactObject {
    public static void main(String[] args) {

        Contact name1 = new Contact();
        name1.setInfo("Mike", 123456789, "geronimos@gmail.com");
        System.out.println(name1);
        name1.call();
        name1.sendEmail();
        name1.sendMessage();

    }
}

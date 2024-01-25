package day29_Inheritance;

public class TestIPhoneObject {
    public static void main(String[] args) {

        IPhone num1 = new IPhone();
        num1.setInfo("Apple", "12", "MaxPro", 1200, "Grey");
        System.out.println(num1);

        System.out.println( num1.call(1234567) );
        System.out.println( num1.text(1234567) );
        System.out.println( num1.faceTime(1234567) );
        System.out.println( num1.faceTime("jora@gmail.com") );






    }
}

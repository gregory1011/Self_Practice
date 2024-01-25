package day27_Static;

public class TestIphoneObject {
    public static void main(String[] args) {

        Iphone phone1 = new Iphone("Model 12", "Small", "Blue", 1200);

        System.out.println(phone1);

        phone1.text(1234567);
        phone1.call(223445554);
        phone1.faceTime("greg@real.com");
        phone1.faceTime(778889099);


    }
}

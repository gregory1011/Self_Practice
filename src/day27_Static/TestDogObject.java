package day27_Static;

public class TestDogObject {
    public static void main(String[] args) {

       Dog dog1 = new Dog("Terrier", "Small", 'M', 3, "Black" ) ;

        dog1.eat();
        dog1.drink();
        dog1.sleep();
        dog1.play();


        System.out.println(Dog.numberOFWings);
        System.out.println(Dog.numberOFLegs);
        System.out.println(Dog.numberOFEyes);



    }
}

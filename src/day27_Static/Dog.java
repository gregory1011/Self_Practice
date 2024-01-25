package day27_Static;

public class Dog {

    public String breed, size;
    public char gender;
    public int age;
    public String color;
    public  static int numberOFLegs, numberOFEyes, numberOFWings;
    public static boolean isFriendly;


    public Dog(String breed, String size, char gender, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;
    }

    static {
        numberOFLegs = 4;
        numberOFEyes = 2;
        numberOFWings = 0;
        isFriendly = true;

    }

    public void eat(){
        System.out.println("Dog "+ breed + " is eating");
    }

    public void drink(){
        System.out.println("Dog "+ breed + " is drinking");
    }

    public void sleep(){
        System.out.println("Dog "+ breed + " is sleeping");
    }

    public void play(){
        System.out.println("Dog "+ breed + " is playing");
    }

    public void bark(){
        System.out.println("Dog "+ breed + " is barking");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }



}

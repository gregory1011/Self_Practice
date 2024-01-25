package day27_Static;

public class TestPersonObject {
    public static void main(String[] args) {

        Person person1 = new Person("Jora", 23, 'M', "English");

        System.out.println(person1);
        person1.eat("Ice Cream");
        person1.drink("Coca Cola");

        System.out.println(person1.name+" has "+ Person.numberOfHead +" head");
        System.out.println(person1.name+ " has one nose: "+ Person.hasNose);





    }
}

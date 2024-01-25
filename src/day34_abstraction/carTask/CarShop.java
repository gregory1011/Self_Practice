package day34_abstraction.carTask;

public class CarShop {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Toyota", "Highlander", 2017, 25000,"Silver");
        System.out.println(toyota);
        toyota.getColor();
        toyota.setColor("White");
        System.out.println(toyota);

        toyota.start();
        toyota.stop();

        System.out.println("-------------------------------------------------------------------------------------");

        Honda honda = new Honda("Honda", "Pilot", 2020, 32000, "Black");
        System.out.println(honda);
        honda.getYear();
        honda.setPrice(29500);
        System.out.println(honda);

        honda.start();
        honda.stop();

        System.out.println("-------------------------------------------------------------------------------------");

        Tesla tesla = new Tesla("Tesla", "Model Y", 2022, 67500, "Pink");
        System.out.println(tesla);
        tesla.setColor("Green");

        tesla.stop();
        tesla.stop();

        tesla.drive();
        tesla.selfDrive();
        tesla.autoPark();










    }
}

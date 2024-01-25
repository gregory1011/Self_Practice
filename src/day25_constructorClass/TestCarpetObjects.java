package day25_constructorClass;

import day17_CustomClass.Car;

public class TestCarpetObjects {
    public static void main(String[] args) {


        Carpet carpet1 = new Carpet(20,20,15,false);
        System.out.println(carpet1);

        Carpet carpet2 = new Carpet(20,20,15,true);
        System.out.println(carpet2);



    }
}

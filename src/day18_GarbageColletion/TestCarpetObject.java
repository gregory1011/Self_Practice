package day18_GarbageColletion;

import day17_CustomClass.Car;

public class TestCarpetObject {

    public static void main(String[] args) {

       Carpet carpet1 = new Carpet();
       carpet1.setInfo(10,20,5,false);
        System.out.println(carpet1);
        System.out.println(carpet1.calcCost());

        Carpet carpet2 = new Carpet();
        carpet2.setInfo(10,20,5,true);
        System.out.println(carpet2.calcCost());


    }
}

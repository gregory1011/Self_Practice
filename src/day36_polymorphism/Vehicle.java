package day36_polymorphism;

import day34_abstraction.carTask.Audi;
import day34_abstraction.carTask.Car;
import day34_abstraction.carTask.Honda;
import day34_abstraction.carTask.Tesla;

public class Vehicle {

    public static void main(String[] args) {


        Car[] cars = {
                new Honda("Honda","Pilot",2010, 25000, "White"),
                new Audi("Audi","Q6", 2014, 32000,"Red"),
                new Honda("Honda","Accord", 2011, 20000 , "White" ),
                new Audi("Audi","Q4", 2015, 33000, "Blue"),
                new Audi("Audi","A7", 2019, 35000, "Black"),
                new Audi("Audi","Q8", 2018, 40000, "White"),
                new Audi("Audi","Q5", 2009, 30000, "Purple"),
                new Audi("Audi","A4", 2011, 30000, "Black"),
                new Honda("Honda","Civic", 2018, 30000, "Red"),
                new Honda("Honda","CR-V", 2012, 23000, "Red"),
                new Honda("Honda","HR-V", 2019, 35000, "Blue"),
                new Tesla("Tesla","Model 3", 2015, 45000, "White"),
                new Tesla("Tesla","Model Y", 2017, 65000, "Black"),
                new Tesla("Tesla","Model X", 2016, 48000, "White"),
                new Tesla("Tesla","Model X", 2014, 48000, "Blue"),
        };

        for (Car eachCar : cars) {
            if (eachCar instanceof Audi){
                if (eachCar.getYear() >= 2015 && eachCar.getYear() <= 2019){
                    System.out.println(eachCar.getMake() +" " + eachCar.getModel() + " " +eachCar.getYear() + " is eligible for recall.");
                }
            }
        }


        for (Car eachCar : cars) {
            if (eachCar instanceof Honda){
                if (eachCar.getYear() >= 2010 && eachCar.getYear() <= 2011){
                    System.out.println(eachCar.getMake() + " " +eachCar.getModel() + " " +eachCar.getYear() + " is eligible for recall.");
                }
            }
        }

        for (Car eachCar : cars) {
            if (eachCar instanceof Tesla){
                if (eachCar.getYear() >= 2015 && eachCar.getYear() <= 2016){
                    System.out.println(eachCar.getMake() + " " +eachCar.getModel() +" " + eachCar.getYear() + " is eligible for recall.");
                }
            }
        }


        int max =0;
        for (Car eachCar : cars) {
            if (eachCar instanceof Car){
                if (eachCar.getPrice() > max){

                }
            }
            System.out.println("max price = $" + max);
        }




    }

}

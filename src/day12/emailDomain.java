package day12;


import java.util.Scanner;

public class emailDomain {

    public static void main(String[] args) {


        emailDomain("greg.rosca@hotmail.com");





    }



   public static void emailDomain (String email) {


       String emailName = "";
       String firstName = emailName.substring(0, emailName.indexOf("@"));


       String domain = emailName.substring(emailName .indexOf("@") + 1, emailName.indexOf("."));


       String rest = emailName.substring(emailName.indexOf("."));

       System.out.println("domain: "+ domain);


   }


}

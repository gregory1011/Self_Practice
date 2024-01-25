package day09_scanner;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many shares they have already?");
        int totalShares = input.nextInt();

        if (totalShares >= 1 ) {


            System.out.println("How much their total value in the stock market is?");
            double value = input.nextDouble();

            input.nextLine();
            System.out.println("Enter the name of the company they have the most shares in");
            String companyName = input.nextLine();

            System.out.println("\"Your total stock market holding is $" + value +
                    " which is made up of "+totalShares+" shares. "+
                    companyName+" is your company holdings\"");


        }else {
            System.out.println("Invalid result");
        }
        input.close();

    }
}

package day09_scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter your hourly rate");
        int hourlyRate = input.nextInt();
        System.out.println("Enter how many hours you work in a week");
        int weekHours = input.nextInt();
        System.out.println("Enter you state tax");
        double stateTax = input.nextDouble() ;
        System.out.println("Enter your federal tax");
        double federalTax = input.nextDouble() ;

       double salary = hourlyRate * weekHours * 4;
       double afterStateTax = salary * stateTax;
       double afterFederalTax = salary * federalTax;
       double totalTax = (stateTax + federalTax);
       double netIncome = salary - totalTax;

        System.out.println("salary = $" + salary);
        System.out.println("stateTax = " + stateTax+"%");
        System.out.println("federalTax = " + federalTax+"%");
        System.out.println("totalTax = $" + totalTax);
        System.out.println("netIncome = $" + netIncome);

        input.close();

    }
}

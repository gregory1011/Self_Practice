package day04_concatenation;

public class SalaryCalculator_02 {
    public static void main(String[] args) {

        int hourlyRate = 50,
                weeklyHours = 45;
        double stateTaxRate = 6,
                federalTaxRate =26;
        int salaryBeforeTax = hourlyRate*weeklyHours*52;
        double stateTax = salaryBeforeTax*stateTaxRate/100;
        double federalTax = salaryBeforeTax*federalTaxRate/100;
        double totalTax = stateTax+federalTax;
        double salaryAfterTax = salaryBeforeTax-totalTax;

        System.out.println("Gross pay is: $" +salaryBeforeTax);
        System.out.println("\tFederal tax is: $"+federalTax);
        System.out.println("\tState tax is: $"+stateTax);
        System.out.println("\tTotal tax is: $"+ totalTax);
        System.out.println("\t Net income is: $ "+ salaryAfterTax);

    }
}

package day25_constructorClass;

public class SalaryCalculator {

    public double hourlyRate, weeklyHours, stateTaxRate, federalTaxRate;

    public SalaryCalculator(double hourlyRate, double weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salary(){
        double salary = ( hourlyRate * weeklyHours * 52);
        return salary;
    }
    public double stateTax(){
        double stateTax = salary() * stateTaxRate / 100;
        return stateTax;
    }
    public double federalTax(){
        double federalTax = salary() * federalTaxRate / 100;
        return federalTax;
    }

    public double salaryAfterTax(){
        double salaryAfterTax = salary() - stateTax() - federalTax();
        return salaryAfterTax;
    }


    public String toString(){
        return "Salary is: "  + salary() + ", stateTax: " + stateTax() +
                ", federalTax: " +federalTax()+ ", salary after tax: " + salaryAfterTax();

    }
}

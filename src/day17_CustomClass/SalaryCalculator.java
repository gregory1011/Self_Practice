package day17_CustomClass;

public class SalaryCalculator {
    public double hourlyRate, stateTaxRate, federalTaxRate, weeklyHours;

    public void setInfo(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        double salary = hourlyRate * weeklyHours * 52;
        return salary;
    }
    public double stateTax (){
        double stateTax =salary() * stateTaxRate /100 ;
        return stateTax;
    }

    public double federalTax (){
        double federalTax =  salary() * federalTaxRate /100 ;
        return federalTax;
    }

    public double salaryAfterTax(){
        double salaryAfterTax = salary() - stateTax() - federalTax();
        return salaryAfterTax;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                " salary=" + salary() +
                ", stateTax=" + stateTax() +
                ", federalTaxR=" + federalTax() +
                ", salaryAfterTax=" + salaryAfterTax() +
                '}';
    }


}

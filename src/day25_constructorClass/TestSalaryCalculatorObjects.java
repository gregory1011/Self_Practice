package day25_constructorClass;

public class TestSalaryCalculatorObjects {
    public static void main(String[] args) {

        SalaryCalculator person1 = new SalaryCalculator(20,40, 6.25, 18.3);
        System.out.println(person1);
        person1.salary();
        person1.stateTax();
        person1.federalTax();
        person1.salaryAfterTax();


        SalaryCalculator person2 = new SalaryCalculator(35,40, 6.25, 20);
        System.out.println(person1);
        person2.salary();
        person2.stateTax();
        person2.federalTax();
        person2.salaryAfterTax();



    }
}

package day17_CustomClass;

public class TestItemObjects {
    public static void main(String[] args) {

        Item item1 = new Item();
        item1.setInfo("Pasta", 3, 10);
        System.out.println(item1);

        SalaryCalculator salary1 = new SalaryCalculator();
        salary1.setInfo(15, 6.25, 18, 40);
        System.out.println(salary1);

    }
}

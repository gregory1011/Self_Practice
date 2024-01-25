package day04_concatenation;

public class PhoneNumber {
    public static void main(String[] args) {
        byte countryCore = 1;
        int areaCode = 703;
        long localNumber = 4512625;
        System.out.println("+"+countryCore+(" (")+ areaCode+") -"+localNumber);
    }
}

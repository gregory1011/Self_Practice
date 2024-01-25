package day34_abstraction.deviceTask;

public class Phone extends Device{

    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }


    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

   public String call (long phoneNum){
       return getBrand() + " "+ getModel() +" is calling";
   }

   public String text(long phoneNum){
        return getBrand() + " "+ getModel() +" is texting";
   }

    @Override
    public String toString() {
        return super.toString();
    }
}

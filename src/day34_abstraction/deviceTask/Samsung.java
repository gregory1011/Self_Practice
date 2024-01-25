package day34_abstraction.deviceTask;

public class Samsung extends Phone implements Downloadable, AndroidApps{

    public Samsung(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }


    @Override
    public void downloadApp() {

    }



}

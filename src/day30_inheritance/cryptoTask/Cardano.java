package day30_inheritance.cryptoTask;

public class Cardano extends CryptoToken {

    public Cardano(double price, double quantity, long marketCap, long volume, long circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }

}

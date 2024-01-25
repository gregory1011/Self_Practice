package day30_inheritance.cryptoTask;

public class CryptoToken {

    private double price;
    private  double quantity;
    private long marketCap, volume,circulatingSupply;
    private boolean isMineable;


    public CryptoToken(double price, double quantity, long marketCap, long volume, long circulatingSupply, boolean isMineable) {
        setPrice(price);
        setQuantity(quantity);
        setMineable(isMineable);
        setVolume(volume);
        setCirculatingSupply(circulatingSupply);
        setMarketCap(marketCap);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        if (price <= 0 ){
            System.out.println("Price can not be set to zero or negative");
            System.exit(1);
        }
        return quantity;
    }

    public void setQuantity(double quantity) {
        if ( quantity <= 0 ){
            System.out.println("Quantity can not be set to zero or negative");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(long marketCap) {
        if ( marketCap < 0){
            System.out.println("Market cap can not be zero");
            System.exit(1);
        }
        this.marketCap = marketCap;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public long getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(long circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public boolean isMineable() {
        return isMineable;
    }

    public void setMineable(boolean mineable) {
        isMineable = mineable;
    }


    public double totalPrice (){
        return (price * quantity);
    }

    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "price= $" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                '}';
    }




}

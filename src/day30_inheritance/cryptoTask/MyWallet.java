package day30_inheritance.cryptoTask;

public class MyWallet {
    public static void main(String[] args) {

        Bitcoin bitcoin = new Bitcoin(36000L, 1.332, 949000000, 7098000, 304455600, true);
        System.out.println(bitcoin);
        System.out.println(bitcoin.totalPrice());


    }
}

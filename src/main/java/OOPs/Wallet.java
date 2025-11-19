package OOPs;

public class Wallet implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Paying using wallet");
    }
}

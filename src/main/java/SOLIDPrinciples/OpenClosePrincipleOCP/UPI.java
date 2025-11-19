package SOLIDPrinciples.OpenClosePrincipleOCP;

public class UPI implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Makng paymnet using UPI: " +  amount);
    }
}

package SOLIDPrinciples.OpenClosePrincipleOCP;

public class DebitCard implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Making payment using debit card: " + amount);
    }
}

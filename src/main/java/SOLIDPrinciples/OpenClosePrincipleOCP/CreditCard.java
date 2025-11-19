package SOLIDPrinciples.OpenClosePrincipleOCP;

public class CreditCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Making Payment using credit card: " + amount);
    }
}

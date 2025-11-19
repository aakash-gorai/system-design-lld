package OOPs;

public class CreditCard extends Card {
    CreditCard(String cardNo, String userName) {
        super(cardNo, userName);
    }

    @Override
    public void pay() {
        System.out.println("Making payment using credit card");
    }
}

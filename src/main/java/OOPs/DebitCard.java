package OOPs;

public class DebitCard extends Card {
    DebitCard(String cardNo, String userName) {
        super(cardNo, userName);
    }

    @Override
    public void pay() {
        System.out.println("Making payment using debit card");
    }
}

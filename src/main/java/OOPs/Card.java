package OOPs;

abstract public class Card implements PaymentMethod{
    private String cardNo;
    private String userName;

    Card(String cardNo, String userName) {
        this.cardNo = cardNo;
        this.userName = userName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getUserName() {
        return userName;
    }
}

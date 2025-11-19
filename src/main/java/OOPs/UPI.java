package OOPs;

public class UPI implements PaymentMethod{
    private String upiId;

    @Override
    public void pay() {
        System.out.println("Paying using UPI");
    }
}

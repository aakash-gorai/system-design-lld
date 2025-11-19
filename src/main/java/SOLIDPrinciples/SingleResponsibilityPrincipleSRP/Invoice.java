package SOLIDPrinciples.SingleResponsibilityPrincipleSRP;

public class Invoice {
    private double amount;
    private String invoiceId;

    Invoice(double amount, String invoiceId) {
        this.amount = amount;
        this.invoiceId = invoiceId;
    }

    //generate invoice
    public void generateInvoice() {
        System.out.println("Generating invoice for the id " + invoiceId + "amount" + amount);
    }
}

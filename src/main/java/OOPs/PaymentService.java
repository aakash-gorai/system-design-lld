package OOPs;

import java.util.HashMap;

public class PaymentService {
    HashMap<String, PaymentMethod> paymentMethods = new HashMap<>();

    public void addPayment(String name, PaymentMethod pm) {
        paymentMethods.put(name, pm);
    }

    public void makePayment(String name) {
        PaymentMethod pm = paymentMethods.get(name);
        pm.pay();
    }
}

package SOLIDPrinciples.InterfaceSegregationPrincipleISP;

public class SimpleMachine implements Printer {
    @Override
    public void print() {
        System.out.println("printing a doc");
    }
}

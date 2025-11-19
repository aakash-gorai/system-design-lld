package SOLIDPrinciples.InterfaceSegregationPrincipleISP;

public class Main {
    public static void main(String[] args) {
        SimpleMachine sm = new SimpleMachine();
        sm.print(); //only print function is there to be called

        ComplexMachine cm = new ComplexMachine();
        cm.copy();
        cm.scan();
        cm.print();
    }
}

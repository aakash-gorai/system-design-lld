package SOLIDPrinciples.InterfaceSegregationPrincipleISP;

public class ComplexMachine implements Printer, Scanner, Copier {
    @Override
    public void print() {
        System.out.println("printing a doc");
    }

    @Override
    public void scan() {
        System.out.println("scanning a doc");
    }

    @Override
    public void copy() {
        System.out.println("copying a doc");
    }
}

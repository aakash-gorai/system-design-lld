package CreationalDesignPatterns.AbstractFactoryDesignPattern;

public class MacScrollBar implements ScrollBar {
    @Override
    public void scroll() {
        System.out.println("MacOS scroll bar");
    }
}

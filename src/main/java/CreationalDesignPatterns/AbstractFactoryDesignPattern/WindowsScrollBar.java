package CreationalDesignPatterns.AbstractFactoryDesignPattern;

public class WindowsScrollBar implements ScrollBar {

    @Override
    public void scroll() {
        System.out.println("Windows scroll bar");
    }
}

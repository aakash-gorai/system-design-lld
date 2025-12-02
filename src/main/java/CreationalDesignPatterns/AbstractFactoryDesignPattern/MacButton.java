package CreationalDesignPatterns.AbstractFactoryDesignPattern;

public class MacButton implements Button {

    @Override
    public void render() {
        System.out.println("Mac OS button");
    }
}

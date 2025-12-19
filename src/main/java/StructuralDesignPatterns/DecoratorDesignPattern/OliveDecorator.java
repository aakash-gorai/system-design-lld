package StructuralDesignPatterns.DecoratorDesignPattern;

public class OliveDecorator extends PizzaDecorator {
    public OliveDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + " olive";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 1.0;
    }
}

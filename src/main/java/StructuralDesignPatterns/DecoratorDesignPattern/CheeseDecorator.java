package StructuralDesignPatterns.DecoratorDesignPattern;

public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + " cheese";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 1.0;
    }
}

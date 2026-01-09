package StructuralDesignPatterns.FlyweightPattern;

public class BulletType {
    private String color;

    public BulletType(String color) {
        this.color = color;
        System.out.println("Creating bullet type with color " + color);
    }

    public void display(){
        System.out.println(color);
    }
}

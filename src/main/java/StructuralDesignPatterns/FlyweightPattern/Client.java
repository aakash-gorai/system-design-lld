package StructuralDesignPatterns.FlyweightPattern;

public class Client {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            Bullet bullet = new Bullet("red", i*10, i*10, i*2.5);
            bullet.display();
        }
    }
}

package StructuralDesignPatterns.ProxyPattern;

public class Client {
    public static void main(String[] args) {
        ProxyImage img1 = new ProxyImage("img1.jpg");
        ProxyImage img2 = new ProxyImage("img2.jpg");

        img1.display();
        img2.display();
    }
}

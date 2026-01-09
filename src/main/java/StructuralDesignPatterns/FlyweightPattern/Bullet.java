package StructuralDesignPatterns.FlyweightPattern;

public class Bullet {
    int x;
    int y;
    double velocity;
    BulletType type;

    public Bullet(String color, int x, int y, double velocity){
        this.type = BulletTypeFactory.getBulletType(color);
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        System.out.println("Creating bullet");
    }
     public void display(){
         System.out.println("Bullet at " + x + " " + y + " " + velocity);
         type.display();
     }
}

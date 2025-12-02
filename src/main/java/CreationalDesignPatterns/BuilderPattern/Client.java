package CreationalDesignPatterns.BuilderPattern;

public class Client {
    public static void main(String[] args) {
        House house = new House.HouseBuilder("foundation", "structure", "roof")
                .setHasGarage(true)
                .setHasSwimmingPool(true)
                .build();

        System.out.println(house);
    }
}

package CreationalDesignPatterns.PrototypeDesignPattern;

public class GamePiece implements Prototype<GamePiece> {
    private String color;
    private String position;

    public GamePiece(String color, String position) {
        this.color = color;
        this.position = position;
    }

    @Override
    public String toString() {
        return "GamePiece{" +
                "color='" + color + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    @Override
    public GamePiece clone() {
        return new GamePiece(this.color, this.position);
    }
}

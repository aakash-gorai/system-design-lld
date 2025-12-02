package CreationalDesignPatterns.PrototypeDesignPattern;

public class Client {
    public static void main(String[] args) {

        GameBoard gameBoard = new GameBoard();
        gameBoard.addPiece(new GamePiece("red", "2"));
        gameBoard.addPiece(new GamePiece("blue", "3"));
        System.out.println(gameBoard);

        GameBoard cloned = gameBoard.clone();
        System.out.println(cloned);
    }
}

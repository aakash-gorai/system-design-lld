package CreationalDesignPatterns.PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class GameBoard implements Prototype<GameBoard> {
    List<GamePiece> gamePieceList = new ArrayList<>();

    public void addPiece(GamePiece gamePiece) {
        gamePieceList.add(gamePiece);
    }

    public List<GamePiece> getGamePieceList() {
        return gamePieceList;
    }

    @Override
    public String toString() {
        return "GameBoard{" +
                "gamePieceList=" + gamePieceList +
                '}';
    }

    @Override
    public GameBoard clone() {
        GameBoard gameBoard = new GameBoard();
        for(GamePiece gamePiece: gamePieceList) {
            gameBoard.addPiece(gamePiece.clone());
        }
        return gameBoard;
    }
}

package app;

import app.pieces.*;
import app.board.*;

public class App {
    public static void main(String[] args) {
        Square[][] gameBoard = new Square[8][8];
        Board board = new Board(gameBoard);
        gameBoard = board.initializeBoard();
        board.drawBoard();
        
    }
}
package app;

import app.pieces.*;
import app.board.*;

public class App {
    public static void main(String[] args) {
        Square[][] board = new Square[8][8];
        Board Board = new Board(board);
        board = Board.initializeBoard();
        Board.drawBoard(board);
        

        
    }
}
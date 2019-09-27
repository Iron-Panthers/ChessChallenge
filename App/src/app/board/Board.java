package app.board;

import app.pieces.*;

public class Board{
    private Square[][] board = new Square[8][8];

    public Board(Square[][] board){
        this.board = initializeBoard();
    }
    public Square[][] initializeBoard(){
        board[0][0] = new Square(0, 0, new Rook(1));
        board[0][1] = new Square(0, 0, new Knight(1));
        board[0][2] = new Square(0, 0, new Bishop(1));
        

        board[0][5] = new Square(0, 0, new Bishop(1));
        board[0][6] = new Square(0, 0, new Knight(1));
        board[0][7] = new Square(0, 0, new Rook(1));







        return board;
    }
}
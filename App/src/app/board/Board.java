package app.board;

import app.pieces.*;

public class Board{
    private Square[][] board = new Square[8][8];

    public Board(Square[][] board){
        this.board = initializeBoard();
    }
    //TODO figure out whether a parameter is needed below
    public Square[][] initializeBoard(){
        //black home row
        board[0][0] = new Square(0, 0, new Rook(1));
        board[0][1] = new Square(0, 1, new Knight(1));
        board[0][2] = new Square(0, 2, new Bishop(1));
        board[0][3] = new Square(0, 3, new Queen(1));
        board[0][4] = new Square(0, 4, new King(1));   
        board[0][5] = new Square(0, 5, new Bishop(1));
        board[0][6] = new Square(0, 6, new Knight(1)); 
        board[0][7] = new Square(0, 7, new Rook(1));

        //white home row
        board[7][0] = new Square(0, 0, new Rook(1));
        board[7][7] = new Square(0, 1, new Knight(1));
        board[7][2] = new Square(0, 2, new Bishop(1));
        board[7][3] = new Square(0, 3, new Queen(1));
        board[7][4] = new Square(0, 4, new King(1));   
        board[7][5] = new Square(0, 5, new Bishop(1));
        board[7][6] = new Square(0, 6, new Knight(1)); 
        board[7][7] = new Square(0, 7, new Rook(1));

        //black pawns
        for(int j = 0; j < 8; j++){
            board[1][j] = new Square(0, j, new Pawn(1));
        }

        //white pawns
        for(int j = 0; j < 8; j++){
            board[6][j] = new Square(0, j, new Pawn(0));
        }
        return board;
    }
}


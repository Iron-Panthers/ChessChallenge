package app.pieces;

import app.board.Square;

public abstract class Piece{
    private int side;
    private boolean isDead;

    Piece(int side){
        this.side = side;
        this.isDead = false;
    }

    //getter method
    public int getSide(){
        return side;
    }

    public boolean isDead(){
        if(isDead == true)
            return true;
        return false;
    }

    public void killPiece(){
        this.isDead = true;
    }

    public abstract boolean isValidMove(Square start, Square end);
}
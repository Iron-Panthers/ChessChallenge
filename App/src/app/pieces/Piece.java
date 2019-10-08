package app.pieces;

import app.board.*;
import app.player.*;

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
        return isDead == true;
    }

    public void killPiece(){
        this.isDead = true;
    }
    
    public abstract boolean isValidMove(Player player, Square[][] board, Square start, Square end);
    public abstract String getName();
    
    // public abstract boolean canReachSpot(Board board);
}
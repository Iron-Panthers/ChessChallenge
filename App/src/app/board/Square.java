package app.board;

import app.pieces.*;
import app.player.*;

public class Square{
    private int x, y;
    private Piece piece;
    private int side;

    public Square(int x, int y, Piece piece){
        this.x = x;
        this.y = y;
        this.piece = piece;
        side = piece.getSide();
    }

    //getter methods
    public int getSide(){
        return side;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public Piece getPiece(){
        return piece;
    }

    public boolean isOccupied(){
        if(piece.getSide() == -1) {
            return false;
        } else {
            return true;
        }
    }

    //setter methods
    public void setPiece(Piece piece){
        this.piece = piece;
    }

    public void move(Player player, Square start, Square end){
        if(player.getPlayerSide() == start.getSide()){
            end.setPiece(start.getPiece());
            start.killPiece(start);
        }
    }

    public void killPiece(Square square){
        Piece blank = new Blank(-1);
        square.setPiece(blank);
    }
}


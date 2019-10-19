package app.board;

import app.pieces.*;

public class Square{
    private int x, y;
    private Piece piece;
    private int side;

    public Square(int x, int y, Piece piece){
        this.x = x;
        this.y = y;
        this.piece = piece;
        this.side = piece.getSide();
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

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    //setter methods
    public void setPiece(Piece piece){
        this.piece = piece;
    }

    public void setSide(int side){
        this.side = side;
    }
}


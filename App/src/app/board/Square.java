package app.board;

import app.pieces.Piece;

public class Square{
    private int x, y;
    Piece piece;

    public Square(int x, int y, Piece piece){
        this.x = x;
        this.y = y;
        this.piece = piece;
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
        if(piece != null) {
            return false;
        } else {
            return true;
        }
    }
}


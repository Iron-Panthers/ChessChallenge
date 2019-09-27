package app.board;

import app.pieces.Piece;

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
        if(piece != null) {
            return false;
        } else {
            return true;
        }
    }
}


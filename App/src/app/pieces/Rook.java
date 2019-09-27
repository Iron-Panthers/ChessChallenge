package app.pieces;

import app.board.*;

public class Rook extends Piece {

    public Rook(int side) {
        super(side);
    }

    @Override
    public boolean isValidMove(Square start, Square end) {
        int initialX = start.getX();
        int initialY = start.getY();
        int finalX = end.getX();
        int finalY = end.getY();
        int changeInX = finalX - initialX;
        int changeInY = finalY - initialY;

        if(((changeInX == 0) && (changeInY != 0)) || ((changeInX == 0) && (changeInY != 0))){
            if(start.getSide() != end.getSide()){
                return true;
            } else{
                return true;
            }
        } else {
            return true;
        }
    }

    @Override
    public String getName() {
        if(getSide() == 1){
        return "Wr";
        } else {
            return "Br";
        }
    }

    
    

}
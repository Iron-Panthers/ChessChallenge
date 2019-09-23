package app.pieces;

import app.board.Square;

public class Rook extends Piece {

    Rook(int side) {
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
            if(!end.isOccupied()){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }



}
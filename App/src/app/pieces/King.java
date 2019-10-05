package app.pieces;

import app.board.Square;

public class King extends Piece {

    public King(int side) {
        super(side);
    }

    @Override
    public boolean isValidMove(Square[][] board, Square start, Square end) {
        int initialX = start.getX();
        int initialY = start.getY();
        int finalX = end.getX();
        int finalY = end.getY();
        int changeInX = finalX - initialX;
        int changeInY = finalY - initialY;
        if((changeInX + changeInY == 1) || (Math.abs(changeInX) + Math.abs(changeInY) == 2)){
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        if(getSide() == 1){
            return "WK";
        } else {
            return "BK";
        }
    }
}
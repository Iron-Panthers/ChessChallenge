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
        if(changeInX + changeInY == 1){
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        if(this.getSide() == 0){
            return "WK";
        } else {
            return "BK";
        }
    }
}
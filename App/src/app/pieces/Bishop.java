package app.pieces;

import app.board.Square;

public class Bishop extends Piece {

    public Bishop(int side) {
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

        if(start.getSide() != end.getSide() && changeInX == changeInY && changeInX * changeInY != 0){
            for(int i = 1; i < changeInX - 1; i++){
                if(board[(changeInX + (changeInX/changeInX)) + i][(changeInY + (changeInY/changeInY)) + i].isOccupied()) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }

    @Override
    public String getName() {
        if(getSide() == 1){
        return "Wb";
        } else {
            return "Bb";
        }
    }

}
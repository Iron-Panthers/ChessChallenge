package app.pieces;

import app.board.Square;

public class Queen extends Piece {

    public Queen(int side) {
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
        
        if(start.getSide() != end.getSide()){
            if((changeInX == 0) && (changeInY != 0) || ((changeInX == 0) && (changeInY != 0))){
                return true;
            } else if(changeInX == changeInY){
                return true;
            } else {
                return false;
            }
        } else{
            return false;
        }
    }

    @Override
    public String getName() {
        if(getSide() == 1){
            return "WQ";
        } else {
            return "BQ";
        }
    }
}
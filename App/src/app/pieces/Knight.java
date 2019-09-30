package app.pieces;

import app.board.Square;

public class Knight extends Piece {
    public Knight(int side) {
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

        if((changeInX * changeInY == 2 || changeInX * changeInY == -2) && start.getSide() != end.getSide()){
            return true;
        }
        return false;   
    }

    @Override
    public String getName() {
        if(getSide() == 1){
        return "Wk";
        } else {
            return "Bk";
        }
    }
}
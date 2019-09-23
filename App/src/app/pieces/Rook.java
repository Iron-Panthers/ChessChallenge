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
        int 

        if((finalX - initialX) * (finalY - initialY) == 0){

        }



        return true;
    }



}
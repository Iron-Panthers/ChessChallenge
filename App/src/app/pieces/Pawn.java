package app.pieces;

import app.board.Square;

public class Pawn extends Piece {

    Pawn(int side) {
        super(side);
    }

    //TODO finish pawn move exception handling
    @Override
    public boolean isValidMove(Square start, Square end) {
        if(start.getSide() == end.getSide()){
            return false;
            //handles pawn moving from home row
        } else if(start.getSide() == 0 && start.getY()
         == 6 && Math.abs(start.getX()) - Math.abs(end.getX())
         == 0 && (end.getY() == 5 || end.getY() == 4)){
            return true;
        } else
        return false;
    }

    @Override
    public String getName() {
        
        return null;
    }

}
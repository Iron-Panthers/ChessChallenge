package app.pieces;

import app.board.*;

public class Pawn extends Piece {
    
    Pawn(int side) {
        super(side);
    }

    @Override
    public boolean isValidMove(Square[][] board, Square start, Square end) {
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
        if(getSide() == 0){
            return "Wp";
        } else {
            return "Bp";
        }
    }

}
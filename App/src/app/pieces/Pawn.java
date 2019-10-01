package app.pieces;

import app.board.*;

public class Pawn extends Piece {
    
    public Pawn(int side) {
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

        if(start.getSide() == end.getSide()){
            return false;
        } else if (!end.isOccupied()){
            //handles white pawn moving from home row
            if((start.getSide() == 1) && (end.getY() - start.getY() == -2) && (changeInX == 0) && (start.getY() == 6) && (changeInY == -2)){ 
                return true;
            //handles black pawn moving from home row
            } else if((start.getSide() == 0) && (end.getY() - start.getY() == 2) && (changeInX == 0) && (start.getY() == 1) && (changeInY == 2)){
                return true; 
            } 
        //handles pawn killing a piece
        } else if(end.isOccupied()){
            if((Math.abs(changeInX) == 1) && (changeInY == 1)){
                end.getPiece().killPiece();
                return true;
            }
        }
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
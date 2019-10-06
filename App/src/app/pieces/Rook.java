package app.pieces;

import app.board.*;

public class Rook extends Piece {

    public Rook(int side) {
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

        //e2 -- e4
        /*
        
        
        */
        
        if(end.getSide() != this.getSide()){
            if(changeInX == 0 && changeInY != 0){
            for(int i = start.getY(); i < end.getY() - 1; i++){
                if(board[start.getX()][i].isOccupied()){
                    return false;
                } 
            }
            return true;
            } else if(changeInY == 0 && changeInX != 0){
                for(int i = start.getX(); i < end.getX() - 1; i++){
                    if(board[i][start.getY()].isOccupied()){
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public String getName() {
        if(getSide() == 1){
        return "Wr";
        } else {
            return "Br";
        }
    }
}
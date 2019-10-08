package app.pieces;

import app.board.*;
import app.player.*;


public class Bishop extends Piece {

    public Bishop(int side) {
        super(side);
    }

    @Override
    public boolean isValidMove(Player player, Square[][] board, Square start, Square end) {
        int r1 = start.getX(); 
        int c1 = start.getY();
        int r2 = end.getX();
        int c2 = end.getY();
        int rChange = r2 - r1;
        int cChange = c2 - c1;

        if(start.getSide() != end.getSide() && rChange == cChange && rChange * cChange != 0){
            for(int i = 1; i < Math.abs(rChange); i++){
                // System.out.println("piece being checked is " + board[r1 + (i*(rChange/Math.abs(rChange)))][c1 + i * (cChange/Math.abs(cChange))].getPiece().getName());
                if(board[r1 + (i*(rChange/Math.abs(rChange)))][c1 + i * (cChange/Math.abs(cChange))].isOccupied()){
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
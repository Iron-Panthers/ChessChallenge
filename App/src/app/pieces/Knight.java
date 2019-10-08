package app.pieces;

import app.board.*;
import app.player.*;

public class Knight extends Piece {
    public Knight(int side) {
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

        // System.out.println("r1 is " + r1);
        // System.out.println("c1 is " + c1);
        // System.out.println("r2 is " + r2);
        // System.out.println("c2 is " + c2);
        // System.out.println("delta r is " + rChange);
        // System.out.println("delta c is " + cChange);

        if(Math.abs(rChange * cChange) == 2 && player.getPlayerSide() == start.getSide()){
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
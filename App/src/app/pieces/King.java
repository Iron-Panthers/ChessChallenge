package app.pieces;

import app.board.*;
import app.player.*;

public class King extends Piece {
    private boolean hasMoved;

    public King(int side) {
        super(side);
        this.hasMoved = false;
    }

    @Override
    public boolean isValidMove(Player player, Square[][] board, Square start, Square end) {
        int r1 = start.getX();
        int c1 = start.getY();
        int r2 = end.getX();
        int c2 = end.getY();
        int rChange = r2 - r1;
        int cChange = c2 - c1;

<<<<<<< HEAD
        // System.out.println("r1 is " + r1);
        // System.out.println("c1 is " + c1);
        // System.out.println("r2 is " + r2);
        // System.out.println("c2 is " + c2);
        // System.out.println("rChange is " + rChange);
        // System.out.println("cChange is " + cChange);
        // System.out.println("starting side is " + start.getSide());
        // System.out.println("ending side is " + end.getSide());
=======
        System.out.println("r1 is " + r1);
        System.out.println("c1 is " + c1);
        System.out.println("r2 is " + r2);
        System.out.println("c2 is " + c2);
        System.out.println("rChange is " + rChange);
        System.out.println("cChange is " + cChange);
        System.out.println("starting side is " + start.getSide());
        System.out.println("ending side is " + end.getSide());
>>>>>>> master

        if(start.getSide() != end.getSide()){
            switch(Math.abs(rChange)){
                case 0: 
                if(Math.abs(cChange) == 1){
                    return true;
                }
                case 1: 
                if(Math.abs(cChange) == 1 || cChange == 0){
                    return true;
                }
                default:
                return false;
            }
        } else if(isCastlingMove(player, board, start, end)){
            return true;
        }
        return false;
    }

    public boolean isCastlingMove(Player player, Square[][] board, Square start, Square end){
        int r1 = start.getX();
        int c1 = start.getY();
        int r2 = end.getX();
        int c2 = end.getY();
        int rChange = r2 - r1;
        int cChange = c2 - c1;

        if((start.getPiece().getName() == "WK" || start.getPiece().getName() == "BK") && (end.getPiece().getName() == "Br" || end.getPiece().getName() == "Wr")){
            // System.out.println("KING IS SELECTED");
            // System.out.println("ROOK IS ALSO SELECTED");
            if(start.getSide() == end.getSide() && !hasMoved && (cChange == 3 || cChange == 4) && (rChange == 0)){
                // System.out.println("CORRECT CASTLING LOCATIONS");
                for(int i = 1; i < cChange; i++){
                    // System.out.println("c1 is now " + (c1 + cChange/Math.abs(cChange) * i));
                    if(board[r1][c1 + ((cChange/Math.abs(cChange)) * i)].isOccupied()){
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
            return "WK";
        } else {
            return "BK";
        }
    }
}
package app.pieces;

import app.board.*;
import app.player.*;

public class Pawn extends Piece {
    
    public Pawn(int side) {
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

        System.out.println("r1 is " + r1);
        System.out.println("c1 is " + c1);
        System.out.println("r2 is " + r2);
        System.out.println("c2 is " + c2);
        System.out.println("delta r is " + rChange);
        System.out.println("delta c is " + cChange);
        System.out.println("the end is occupied: " + end.isOccupied());

        if(player.getPlayerSide() != start.getSide()){
            return false;
        }
        
        //handles normal moves that don't kill
        if(cChange == 0 && !end.isOccupied() && Math.abs(rChange) == 1){
            //handles white pawns moving "backwards"
            if(start.getSide() == 1 && rChange == -1){
                return true;
            } //handles black pawn moving forward
            else if(start.getSide() == 0 && rChange == 1){
                return true;
            }
        } //handles moves that kill
        else if(Math.abs(rChange) == 1 && Math.abs(cChange) == 1 && end.isOccupied()){
            if(start.getSide() == 1 && end.getSide() == 0 && rChange == -1){
                return true;
            } else if(start.getSide() == 0 && end.getSide() == 1 && rChange == 1){
                return true;
            }
        } 
        return false;

    //     if(start.getSide() == end.getSide()){
    //         return false;
    //     } else if (!end.isOccupied()){
    //         //handles white pawn moving from home row
    //         if((start.getSide() == 1) && (end.getY() - start.getY() == -2) && (changeInX == 0) && (start.getY() == 6) && (changeInY == -2)){ 
    //             return true;
    //         //handles black pawn moving from home row
    //         } else if((start.getSide() == 0) && (end.getY() - start.getY() == 2) && (changeInX == 0) && (start.getY() == 1) && (changeInY == 2)){
    //             return true; 
    //             //handles normal moves
    //         } else if(changeInY == 1 && changeInY == 0){
    //             return true;
    //         }
    //     //handles pawn killing a piece
    //     } else if(end.isOccupied()){
    //         if((Math.abs(changeInX) == 1) && (changeInY == 1)){
    //             end.getPiece().killPiece();
    //             return true;
    //         }
    //     }
    //     return false;
    }

    @Override
    public String getName() {
        if(getSide() == 1){
            return "Wp";
        } else {
            return "Bp";
        }
    }

}
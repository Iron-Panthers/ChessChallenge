package app.pieces;

import app.board.*;
import app.player.*;

public abstract class Piece{
    private int side;
    private boolean isDead;

    public Piece(int side){
        this.side = side;
        this.isDead = false;
    }

    //getter method
    public int getSide(){
        return side;
    }

    public boolean isDead(){
        return isDead == true;
    }

    public void killPiece(){
        this.isDead = true;
    }
    
    public static boolean risksKing(Square[][] board){
        //make sure neither white or black king are open
        Player testPlayer1 = new Player(1);
        Player testPlayer2 = new Player(0);
        
        if(Board.getWhiteKingSquare(board) == null){
            
        }
        Square whiteKing = Board.getWhiteKingSquare(board);
        Square blackKing = Board.getBlackKingSquare(board);

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
               switch(board[i][j].getSide()){
                   case 1: //white
                   if(board[i][j].getPiece().isValidMove(testPlayer1, board, board[i][j], blackKing)){
                    return true;
                    } else { 
                        break;
                    }
                    case 0: //black 
                    if(board[i][j].getPiece().isValidMove(testPlayer2, board, board[i][j], whiteKing)){
                        return true;
                    } else {
                        break;
                    }
                    case -1: default:
                    break;
               }
            }
        }

        return false;
    }
    
    public abstract boolean isValidMove(Player player, Square[][] board, Square start, Square end);
    public abstract String getName();

}
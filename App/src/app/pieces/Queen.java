package app.pieces;

import app.board.Square;
import app.player.Player;

public class Queen extends Piece {

    public Queen(int side) {
        super(side);
    }

    @Override
    public boolean isValidMove(Player player, Square[][] board, Square start, Square end) {
        Rook rookCheck = new Rook(start.getSide());
        Bishop bishopCheck = new Bishop(start.getSide());

        //queen move can only be valid rook or bishop move -> no castling
        if(rookCheck.isValidMove(player, board, start, end) || bishopCheck.isValidMove(player, board, start, end)){
            return true;
        }

        return false;
    }

    @Override
    public String getName() {
        if(getSide() == 1){
            return "WQlol";
        } else {
            return "BQ";
        }
    }
}
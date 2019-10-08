package app.pieces;

import app.board.*;
import app.player.*;

public class Blank extends Piece {

    public Blank(int side) {
       super(side);
    }

    @Override
    public boolean isValidMove(Player player, Square[][] board, Square start, Square end) {
        return false;
    }

    @Override
    public String getName() {
       return "  ";
    }

}
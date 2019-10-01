package app.pieces;

import app.board.Square;

public class Blank extends Piece {

    public Blank(int side) {
       super(side);
    }

    @Override
    public boolean isValidMove(Square[][] board, Square start, Square end) {
        return false;
    }

    @Override
    public String getName() {
       return "  ";
    }

}
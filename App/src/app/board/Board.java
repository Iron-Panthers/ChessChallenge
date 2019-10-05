package app.board;

import app.pieces.*;

public class Board{
    private Square[][] board = new Square[8][8];

    public Board(Square[][] board){
        this.board = initializeBoard();
    }
    
    public Square[][] initializeBoard(){
        //black home row
        board[0][0] = new Square(0, 0, new Rook(1));
        board[0][1] = new Square(0, 1, new Knight(1));
        board[0][2] = new Square(0, 2, new Bishop(1));
        board[0][3] = new Square(0, 3, new Queen(1));
        board[0][4] = new Square(0, 4, new King(1));   
        board[0][5] = new Square(0, 5, new Bishop(1));
        board[0][6] = new Square(0, 6, new Knight(1)); 
        board[0][7] = new Square(0, 7, new Rook(1));

        //white home row
        board[7][0] = new Square(0, 0, new Rook(1));
        board[7][1] = new Square(0, 1, new Knight(1));
        board[7][2] = new Square(0, 2, new Bishop(1));
        board[7][3] = new Square(0, 3, new Queen(1));
        board[7][4] = new Square(0, 4, new King(1));   
        board[7][5] = new Square(0, 5, new Bishop(1));
        board[7][6] = new Square(0, 6, new Knight(1)); 
        board[7][7] = new Square(0, 7, new Rook(1));

        //black pawns
        for(int j = 0; j < 8; j++){
            board[1][j] = new Square(1, j, new Pawn(1));
        }

        //white pawns
        for(int j = 0; j < 8; j++){
            board[6][j] = new Square(6, j, new Pawn(0));
        }

        //blank pieces
        for(int i = 2; i < 6; i++){
            for(int j = 0; j < 8; j++){
                board[i][j] = new Square(i, j, new Blank(-1));
            }
        }
        return board;
    }

    public Square[][] initializeBoard(Square[][] board){
        //black home row
        board[0][0] = new Square(0, 0, new Rook(1));
        board[0][1] = new Square(0, 1, new Knight(1));
        board[0][2] = new Square(0, 2, new Bishop(1));
        board[0][3] = new Square(0, 3, new Queen(1));
        board[0][4] = new Square(0, 4, new King(1));   
        board[0][5] = new Square(0, 5, new Bishop(1));
        board[0][6] = new Square(0, 6, new Knight(1)); 
        board[0][7] = new Square(0, 7, new Rook(1));

        //white home row
        board[7][0] = new Square(7, 0, new Rook(1));
        board[7][7] = new Square(7, 1, new Knight(1));
        board[7][2] = new Square(7, 2, new Bishop(1));
        board[7][3] = new Square(7, 3, new Queen(1));
        board[7][4] = new Square(7, 4, new King(1));   
        board[7][5] = new Square(7, 5, new Bishop(1));
        board[7][6] = new Square(7, 6, new Knight(1)); 
        board[7][7] = new Square(7, 7, new Rook(1));

        //black pawns
        for(int j = 0; j < 8; j++){
            board[1][j] = new Square(0, j, new Pawn(1));
        }

        //white pawns
        for(int j = 0; j < 8; j++){
            board[6][j] = new Square(0, j, new Pawn(0));
        }

        //blank pieces
        for(int i = 2; i < 6; i++){
            for(int j = 0; j < 8; j++){
                board[i][j] = new Square(i, j, new Blank(-1));
            }
        }
        return board;
    }
    
    public Square[][] getBoard(){
        return board;
    }

    public void drawBoard(Square[][] board){
        char[] letterSet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        int[] numberSet = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println();

        System.out.print("  ");
        for(int i = 0; i < letterSet.length; i++){
            System.out.print(letterSet[i] + "    ");
        }

        for(int row = 0; row < board.length; row++){
                System.out.println();
                System.out.print(numberSet[row]);
                for(int col = 0; col < board[0].length; col++){
                    System.out.print("[" + board[row][col].getPiece().getName() + "] ");
                }
            }

            System.out.println();

        // System.out.println();
        // for(int i = 0; i < 8; i++)
        //     System.out.print("_____");

        // for(int row = 0; row < board.length; row++){
        //     System.out.println();
        //     System.out.print("| ");
        //     for(int col = 0; col < board[0].length; col++){
        //         System.out.print(board[row][col].getPiece().getName() + " | ");
        //     }
        // }

        // System.out.println();
        // System.out.print("-");
        // for(int i = 0; i < 8; i++)
        //     System.out.print("_____");
        // System.out.println();
        
    } 
}


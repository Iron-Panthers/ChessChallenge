package app.board;

import app.pieces.*;

public class Board{
    public Board(Square[][] board){
<<<<<<< HEAD
        initializeBoard(board);
    }

    public Board(){
    }

    public static Square getWhiteKingSquare(Square[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j].getPiece().getName() == "WK"){
                    Square whiteKing = new Square(board[i][j].getX(), board[i][j].getY(), board[i][j].getPiece());
                    return whiteKing;
                }
            }
        }
        
        return null;
    }

    public static Square getBlackKingSquare(Square[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j].getPiece().getName() == "BK"){
                    Square blackKing = new Square(board[i][j].getX(), board[i][j].getY(), board[i][j].getPiece());
                    return blackKing;
                }
            }
        }
        
        return null;
    }

    public static void initializeBoard(Square[][] board){
=======
        this.initializeBoard(board);
    }

    public Board(){
        
    }

    public void initializeBoard(Square[][] board){
>>>>>>> master
        //black home row
        board[0][0] = new Square(0, 0, new Rook(0));
        board[0][1] = new Square(0, 1, new Knight(0));
        board[0][2] = new Square(0, 2, new Bishop(0));
        board[0][3] = new Square(0, 3, new Queen(0));
        board[0][4] = new Square(0, 4, new King(0));   
        board[0][5] = new Square(0, 5, new Bishop(0));
        board[0][6] = new Square(0, 6, new Knight(0)); 
        board[0][7] = new Square(0, 7, new Rook(0));

        //white home row
        board[7][0] = new Square(7, 0, new Rook(1));
        board[7][1] = new Square(7, 1, new Knight(1));
        board[7][2] = new Square(7, 2, new Bishop(1));
        board[7][3] = new Square(7, 3, new Queen(1));
        board[7][4] = new Square(7, 4, new King(1));   
        board[7][5] = new Square(7, 5, new Blank(-1));
        board[7][6] = new Square(7, 6, new Blank(-1)); 
        board[7][7] = new Square(7, 7, new Rook(1));

        //black pawns
        for(int j = 0; j < 8; j++){
            board[1][j] = new Square(1, j, new Pawn(0));
        }

        //white pawns
        for(int j = 0; j < 8; j++){
            board[6][j] = new Square(6, j, new Pawn(1));
        }

        //blank pieces
        for(int i = 2; i < 6; i++){
            for(int j = 0; j < 8; j++){
                board[i][j] = new Square(i, j, new Blank(-1));
            }
        }
<<<<<<< HEAD
=======
    }

    public Square[][] getBoard(){
        return board;
>>>>>>> master
    }

    public static void drawBoard(Square[][] board){
        char[] letterSet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        int[] numberSet = {8, 7, 6, 5, 4, 3, 2, 1};
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
                System.out.print(numberSet[row]);
            }
            
        System.out.println(); 
        System.out.print("  ");
        for(int i = 0; i < letterSet.length; i++){
            System.out.print(letterSet[i] + "    ");
        }
<<<<<<< HEAD

         System.out.println();

    }


=======

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
>>>>>>> master
} 
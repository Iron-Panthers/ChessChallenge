package app;

// import app.pieces.*;
import app.board.*;
import app.pieces.*;
import java.util.Scanner;
import app.player.*;

public class App {
    public static void main(String[] args) {
        //initializations
        Scanner scan = new Scanner(System.in);
        Player player1 = new Player(1);
        Player player2 = new Player(0);
        Player currentPlayer = player1;
        String input;
        int[] move;
        boolean isGameOver = false;
        
        //handle opening board
        Square[][] board = new Square[8][8];
        Board b = new Board(board);
        b.initializeBoard(board);
        b.drawBoard(board);

        //ACTUAL GAME LOOP
       for(int i = 0; i < 10; i++){
            input = getValidUserInput(board, currentPlayer, scan);
            System.out.println(currentPlayer.getName()  + " said " + input);
            move = convertInput(input); //converted input
            move(currentPlayer, board, move);
            b.drawBoard(board);
            
            //switch current player
            System.out.println(currentPlayer.getName() + " has gone: " + currentPlayer.hasGone(currentPlayer));
            if(currentPlayer.getPlayerSide() == 1){
                currentPlayer = player2;
            } else if(currentPlayer.getPlayerSide() == 0){
                currentPlayer = player1;
            }
        }
    }

    public static String getValidUserInput(Square[][] board, Player currentPlayer, Scanner scan){
        boolean current = false;   
        String input;
    
        while(!current){
            System.out.print(currentPlayer.getName() + ", please enter your move: ");
            input = scan.nextLine();
            current = isValidInput(input);

            if(current){
                int[] move = convertInput(input);
                int r1 = move[0]; 
                int r2 = move[2]; 
                int c1 = move[1]; 
                int c2 = move[3]; 
                if(board[r1][c1].getPiece().isValidMove(currentPlayer, board, board[r1][c1], board[r2][c2])){
                    return input;
                } 
                else {
                    current = false;
                }
            }
            System.out.println("Invalid input. Please input a valid move.");
        }

        return "Error message";
    }
   
    public static void move(Player player, Square[][] board, int[] move){
        int r1 = move[0];
        int r2 = move[2];
        int c1 = move[1];
        int c2 = move[3];
        int cChange = c2 - c1;
        King king = new King(board[r1][c1].getSide());

        if(king.isCastlingMove(player, board, board[r1][c1], board[r2][c2])){
            System.out.println("You have done a castling move");
            board[r2][c2].setPiece(board[r1][c1].getPiece()); //moves king
            int rookChange = -1 * (cChange/cChange * ((Math.abs(cChange) - 1)));
            board[r1][c2 + rookChange].setPiece(new Rook(player.getPlayerSide()));
            board[r1][c2 + rookChange].setSide(player.getPlayerSide());
            killPiece(board[r1][c1]);
            player.setToGone();
            
        } else {
            board[r2][c2].setSide(board[r1][c1].getSide());
            board[r2][c2].setPiece(board[r1][c1].getPiece());
            killPiece(board[r1][c1]);
            player.setToGone();
        }
    }

    public static int[] convertInput(String input){
        int[] inputArray = new int[4];
        for(int i = 0; i < inputArray.length; i++){
            switch(input.charAt(i)){
                case 'a': case '1':
                inputArray[i] = 0;
                break;
                case 'b': case '2':
                inputArray[i] = 1;
                break;
                case 'c': case '3':
                inputArray[i] = 2;
                break;
                case 'd': case '4':
                inputArray[i] = 3;
                break;
                case 'e': case '5':
                inputArray[i] = 4;
                break;
                case 'f': case '6':
                inputArray[i] = 5;
                break;
                case 'g': case '7':
                inputArray[i] = 6;
                break;
                case 'h': case '8':
                inputArray[i] = 7;
                break;
            }
        }

        int[] finalInputArray = new int[4];
        finalInputArray[0] = 7 - (inputArray[1]);
        finalInputArray[1] = inputArray[0];
        finalInputArray[2] = 7 - (inputArray[3]);
        finalInputArray[3] = inputArray[2];
        // System.out.println("input array is " + inputArray[0] + inputArray[1] + inputArray[2] + inputArray[3]);

        return finalInputArray;
    }

    public static boolean isValidInput(String input){
        char[] letterSet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        char[] numberSet = {'1', '2', '3', '4', '5', '6', '7', '8'};

        if(input.length() != 4){
            return false;
        }

        for(int i = 0; i < 8; i++){
            if(input.charAt(0) == letterSet[i]){
                break;
            } else if(i == 7){
                return false;
            }
        }

        for(int i = 0; i < 8; i++){
            if(input.charAt(1) == numberSet[i]){
                break;
            } else if(i == 7){
                return false;
            }
        }

        for(int i = 0; i < 8; i++){
            if(input.charAt(2) == letterSet[i]){
                break;
            } else if(i == 7){
                return false;
            }
        }

        for(int i = 0; i < 8; i++){
            if(input.charAt(3) == numberSet[i]){
                break;
            } else if(i == 7){
                return false;
            }
        }
        return true;
    }      

    public static void killPiece(Square square){
        square.setSide(-1);
        square.setPiece(new Blank(-1));
    }
}
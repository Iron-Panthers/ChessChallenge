package app;

// import app.pieces.*;
import app.board.*;
import app.pieces.*;
import java.util.Scanner;
import app.player.*;

public class App {
    public static void main(String[] args) {
        //initializing players
        Player player1 = new Player(0);
        Player player2 = new Player(2);
        Player currentPlayer = player1;

        //handle opening board
        Square[][] board = new Square[8][8];
        Board Board = new Board(board);
        Board.initializeBoard(board);
        Board.drawBoard(board);
        String input = getValidUserInput(currentPlayer);
        System.out.println(currentPlayer.getName()  + " said " + input);
        int[] move = convertInput(input); //converted input

        //input converter test
        System.out.print("Converted input is: ");
        for(int c : move)
        System.out.print(c);
        System.out.println();

       
        System.out.println("starting piece is "  + board[move[0]][move[1]].getPiece().getName());
        System.out.println("ending piece is " + board[move[2]][move[3]].getPiece().getName());

    }

    public static void move(Player player, Square start, Square end){
        if(player.getPlayerSide() == start.getSide()){
            end.setPiece(start.getPiece());
            start.killPiece(start);
        }

        
    }

    public static void killPiece(Square square){
        Piece blank = new Blank(-1);
        square.setPiece(blank);
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

        //just making main easier to read
        int[] finalInputArray = new int[4];
        finalInputArray[0] = 7 - (inputArray[1]);
        finalInputArray[1] = inputArray[0];
        finalInputArray[2] = 7 - (inputArray[3]);
        finalInputArray[3] = inputArray[2];
        // System.out.println("input array is " + inputArray[0] + inputArray[1] + inputArray[2] + inputArray[3]);

        return finalInputArray;
    }

    public static String getValidUserInput(Player currentPlayer){
        Scanner scan = new Scanner(System.in);
        boolean current = false;   

        while(!current){
            System.out.println(currentPlayer.getName() + ", please enter your move: ");
            String input = scan.nextLine();
            current = isValidInput(input);
            if(current){
                scan.close();
               return input;
            }
            System.out.println("Invalid move. Please enter a valid move.");
        }

        scan.close();
        return "Error message";
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
}
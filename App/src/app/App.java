package app;

// import app.pieces.*;
import app.board.*;
import java.util.Scanner;
import app.player.*;

public class App {
    public static void main(String[] args) {
        //initializing players
        Player player1 = new Player(0);
        Player player2 = new Player(2);

        //handle opening board
        Square[][] board = new Square[8][8];
        Board Board = new Board(board);
        board = Board.initializeBoard();
        Board.drawBoard(board);
        String input = getValidUserInput();
        System.out.println("" + input);

    }

    public int[] convertInput(String input){
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
        return inputArray;
    }

    public static String getValidUserInput(){
        Scanner scan = new Scanner(System.in);
        boolean current = false;   

        while(!current){
            System.out.println("Please enter your move: ");
            String input = scan.nextLine();
            current = isValidInput(input);
            if(current){
                scan.close();
               return input;
            }
            System.out.println("Invalid move.");
        }

        scan.close();
        return "Invalid";
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
package app;

// import app.pieces.*;
import app.board.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //handle opening board
        Square[][] board = new Square[8][8];
        Board Board = new Board(board);
        board = Board.initializeBoard();
        Board.drawBoard(board);
        String input = getValidUserInput();
        System.out.println("Your input was: " + input);

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
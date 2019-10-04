package app;

import app.pieces.*;
import app.board.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //handle opening board
        Square[][] board = new Square[8][8];
        Board Board = new Board(board);
        board = Board.initializeBoard();
        Board.drawBoard(board);


        
        boolean current = false;        
        while(!current){
            System.out.println("Please enter your move: ");
            String input = scan.nextLine();
            current = isValidInput(input);
            System.out.println(isValidInput(input));
            if(current){
                break;
            }
        }

    
    }

    public static boolean isValidInput(String input){
        char[] letterSet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        char[] numberSet = {'1', '2', '3', '4', '5', '6', '7', '8'};
        int[] numberSet2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

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
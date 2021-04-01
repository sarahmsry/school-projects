//Name: Sarah Masry
//PantherID: 002519149
//Due Date: Feb 20

import java.util.*;
public class TicTac{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[][] board;
		board = new char [3][3]; //Initializes 2d array with three rows and three columns 
		char player = 'X';
		int whichPlayer = 1;
		System.out.println("Welcome to TicTacToe game! We have the following 3x3 empty board.");
		for(int i = 0; i < 3; i++) { 
			for (int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		}
		player = 'X';
		boolean winner = false;
		while (true) { //Game continues until there is a winner 
			boolean Play; 
			int i = 0;
			int j = 0;
			printBoard(board);
			System.out.println("Player 1: \n");
		//Prompts player to enter desired row and column
			System.out.println("Enter row index: ");
			System.out.println("Enter column index: ");
			i = input.nextInt();
			j = input.nextInt();
			Play = checkValidPlay(i, j, board);
			while(Play == false);
			board[i][j] = player;
			winner = checkForWinner(player, board); //Checks to see if there is a winner 
			if(winner == true) { //Alternates players 
				break;
			}
			if(player == 'O') {
				player = 'X';
				whichPlayer = 1;;
			}
			else {
				player = 'O';
				whichPlayer = 'X';
			}
		}
		printBoard(board); //Prints the board 
		 if (winner){
			 if(player == 'X') {
				 System.out.println("Player 1 is the winner!");
         }
			 else {
				 System.out.println("Player 2 is the winner!");
			 }
		 }
		 else {
			 System.out.println("Draw");
		 }
         if (player == 'O') {
             player = 'X';

         }
         else {
             player = 'O';
         }
		}
	
	public static void printBoard(char[][] board) { //Creates and prints the tic-tac-toe board 
		for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (j == board[i].length - 1) System.out.print(board[i][j]);
                else System.out.print( board[i][j] + " | ");
            }
            System.out.println();
		}
	}
	public static boolean checkValidPlay(int i, int j, char[][]board) { //Checks if play is valid (valid rows and columns)
		if(board[i][j] == '\0' ){  //Stops player from selecting a location that has already been used 
            System.out.println("That location is occupied");  
	 }
		if (i < 0 || i > 3 && j < 0 || j > 3 && board[i][j] != '-') {
			return true;
		}
		else {
			return true;
		}
	}
	public static boolean checkForWinner(char player, char[][] board) { //Checks rows, columns, and diagonals to find a winner
		for (int i = 0; i < 3; i++) {
			if(board[i][0] == player &&
			board[i][1] == player &&
			board[i][2] == player)
			return true;
		}
		for (int j = 0; j < 3; j++){
			if (board[j][0] == player &&
			board[j][1] == player &&
			board[j][2] == player)
			return true;
		}
		if(board[0][0] == player &&
			board[1][1] == player &&
			board[2][2] == player)
			return true;
		
		if(board[2][0] == player &&
				board[1][1] == player &&
				board[0][2] == player)
				return true;
		return false;
	}
}



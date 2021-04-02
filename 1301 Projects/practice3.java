import java.util.Scanner;
public class practice3{ 
	
		public static void printBoard(char[][] board){
			for (int i = 0; i < board.length; i++) {
				System.out.println("----------");
	            for (int j = 0; j < board[i].length; j++) {
	                if (j == board[i].length - 1) 
	                	System.out.print(board[i][j]);
	                else 
	                	System.out.print( board[i][j] + " | ");
	            }
	            if (board[i][j] == null) {
	                System.out.print(" - ");
	            } else {
	                System.out.print(board[i][j]);
	            }
	            System.out.println();
	        }
			System.out.println("----------");
			}
		
		public static Boolean checkWinner(char[][] board){
	        for (int i = 0; i< board.length; i++) {
	            for (int j = 0; j < board[0].length; j++) {
	                if (board[i][j] == 'O' || board[i][j] == 'X') {
	                    return false;
	                }
	            }
	        }
	        return false;
		}
		
		
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			final char[][] board;
			board = new char [3][3];
			String player1 = "X";
			String player2 = "O";
			printBoard(board);
			
			}
		}



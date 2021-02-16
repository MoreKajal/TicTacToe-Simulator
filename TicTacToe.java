import java.util.Scanner;
public class TicTacToe {
	
	public static void createCroosBoard() {
		char[] crossBoard = new char[10];
		for (int i = 0; i < crossBoard.length; i++) {
			crossBoard[i] = ' ';
		}
	}
	
	//Choose letter X or O
	public char playerOne;
	public char playerComp;
	
	public char chooseLetter() {
		System.out.println("Please Select 'X' or 'O'");
		Scanner input = new Scanner(System.in);
		char letter = input.next().toUpperCase().charAt(0);
		if(letter == 'X') {
			playerOne = 'X';
			playerComp = 'O';
			System.out.println("Computer Has Entered :" + playerComp);
		}else{
			playerOne = 'O';
			playerComp = 'X';
			System.out.println("Computer Has Entered :" + playerComp);
		}
		return playerOne;
	}

	//Display Board
	static char[] board = new char[10];
	public static void showBoard() {
		System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " | ");
		System.out.println("|----------|");
		System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " | ");
		System.out.println("|----------|");
		System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " | ");
	}

	public static void main(String[] args) {
		System.out.println("***Welcome to Tic Tac Toe Game***");
		createCroosBoard();
		TicTacToe obj = new TicTacToe();
		char playerOne = obj.chooseLetter();
		System.out.println("Player One Has Entered :" + playerOne);
		showBoard();

	}	
}

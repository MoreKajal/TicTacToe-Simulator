
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
	
	public void makeMove(char[] board, char player) {
		System.out.println("Choose Cell Index 1-9 to Enter Letter ");
		Scanner input = new Scanner(System.in);
		int userInput = input.nextInt();
		if (userInput > 0 && userInput < 10  || userInput < 10 && (board[userInput] == ' ')) {
			System.out.println("Cell is Free");
			System.out.println("Player can Make the Move");
		}
		else {
		System.out.println("Cell is Not Free");	
		}
	}
	public static final int HEAD = 1;
	public static final int TAIL = 0;
	public static void makeToss() {
		double toss = Math.floor(Math.random() * 10 ) % 2;
		if ((int)toss == HEAD) {
			System.out.println("PlayerOne Won The Toss ");
		}else {
			System.out.println("PlayerComp Won The Toss ");
		}	
	}
	
	public static void checkWinOrTie() {
		if (board[1] == board[4] && board[4] == board[7] && board[1] != ' ') {
			System.out.println("Its a Win");
		}else if (board[2] == board[5] && board[5] == board[8] && board[2] != ' ') {
			System.out.println("Its a Win");
		}else if (board[3] == board[6] && board[6] == board[9] && board[3] != ' ') {
			System.out.println("Its a Win");
		}else if (board[1] == board[2] && board[2] == board[3] && board[2] != ' ') {
			System.out.println("Its a Win");
		}else if (board[4] == board[5] && board[5] == board[6] && board[6] != ' ') {
				System.out.println("Its a Win");
		}else if (board[7] == board[8] && board[8] == board[9] && board[7] != ' ') {
			System.out.println("Its a Win");
		}else if (board[1] == board[5] && board[5] == board[9] && board[9] != ' ') {
			System.out.println("Its a Win");
		}else if (board[3] == board[5] && board[5] == board[7] && board[7] != ' ') {
			System.out.println("Its a Win");
		}else
			System.out.println("Its a Tie");
	}
	
	public static void main(String[] args) {
		System.out.println("***Welcome to Tic Tac Toe Game***");
		createCroosBoard();
		makeToss();
		TicTacToe obj = new TicTacToe();
		char playerOne = obj.chooseLetter();
		System.out.println("Player One Has Entered :" + playerOne);
		showBoard();
		obj.makeMove(board, playerOne);
		checkWinOrTie();
		}
}




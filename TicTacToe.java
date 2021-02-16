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

	public static void main(String[] args) {
		System.out.println("***Welcome to Tic Tac Toe Game***");
		createCroosBoard();
		TicTacToe obj = new TicTacToe();
                char playerOne = obj.chooseLetter();
                System.out.println("Player One Has Entered :" + playerOne);
	}	
}

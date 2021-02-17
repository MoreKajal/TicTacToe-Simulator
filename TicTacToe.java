public class TicTacToe {
	
	public static void createCroosBoard() {
		char[] crossBoard = new char[10];
		for (int i = 0; i < crossBoard.length; i++) {
			crossBoard[i] = ' ';
		}
	}
	public static void main(String[] args) {
		System.out.println("***Welcome to Tic Tac Toe Game***");
		createCroosBoard();
	}
	
}

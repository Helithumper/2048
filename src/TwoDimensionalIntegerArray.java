public abstract class TwoDimensionalIntegerArray {

	// Initializes Board
	protected void initializeArray(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = 0;
			}
		}
	}

	// Prints Out Board
	protected String printArray(int[][] board) {
		String result = "";
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				result += board[i][j] + " ";
			}
			result += "\n";
		}
		return result;
	}

	// Checks for Number,if found it returns true
	protected Boolean searchArray(int[][] board, int val) {
		Boolean result = false;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == val) {
					result = true;
				}
			}
		}
		return result;
	}
}

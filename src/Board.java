import java.util.Random;

public class Board extends TwoDimensionalIntegerArray{
	// Fields
	private int[][] tileBoard = new int[5][5];
	private Random rand = new Random();

	// Constructor
	public Board() {
		initializeArray(tileBoard);
		addInitialTiles(tileBoard, 2, 2);

	}

	// AM

	// Methods
	public boolean checkForTile(int value){
		for(int i = 0; i < tileBoard.length; i++){
			for( int j = 0; j< tileBoard[i].length; j++){
				if(value == tileBoard[i][j]){
					return true;
				}
			}
		}
		return false;
	}
	private void addInitialTiles(int[][] board, int initVal, int numofTiles) {

		while (numofTiles > 0) {
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					if (rand.nextInt(100) == 1 && numofTiles > 0) {
						board[i][j] = initVal;
						numofTiles--;
					}
				}
			}
		}

	}

	protected void addRandomTile(int[][] board, int value) throws Exception {
		if (searchArray(tileBoard, 0)) {
			int numofTiles = 1;
			while (numofTiles > 0) {
				for (int i = 0; i < board.length; i++) {
					for (int j = 0; j < board[i].length; j++) {
						if (rand.nextInt(100) == 1 && numofTiles > 0
								&& board[i][j] == 0) {
							board[i][j] = value;
							numofTiles--;
						}
					}
				}
			}
		} else {
			throw new Exception();
		}
	}

	protected void moveTiles(String direction) throws Exception {
		int val = 0;
		switch (direction) {
		case "down":
			for (int indx = 0; indx < 5; indx++) {// 5 loop
				for (int i = 0; i < tileBoard.length - 1; i++) {// i loop
					for (int j = 0; j < tileBoard[i].length; j++) {// j loop
						if (tileBoard[i + 1][j] == 0) {
							tileBoard[i + 1][j] = tileBoard[i][j];
							tileBoard[i][j] = 0;
						}// end of if
						else if (tileBoard[i + 1][j] == tileBoard[i][j]) {
							val = tileBoard[i + 1][j] * 2;
							tileBoard[i][j] = 0;
							tileBoard[i + 1][j] = val;
							val = 0;
						}// end of else
					}// end of j loop
				}// end of i loop
			}// end of 5 loop
			try {
				addRandomTile(tileBoard, 2);
			} catch (Exception e) {
				throw new Exception();
			}
			break;
		case "up":
			for (int indx = 0; indx < 5; indx++) {// 5 loop
				for (int i = 1; i < tileBoard.length; i++) {// i loop
					for (int j = 0; j < tileBoard[i].length; j++) {// j loop
						if (tileBoard[i - 1][j] == 0) {
							tileBoard[i - 1][j] = tileBoard[i][j];
							tileBoard[i][j] = 0;
						}// end of if
						else if (tileBoard[i - 1][j] == tileBoard[i][j]) {
							val = tileBoard[i - 1][j] * 2;
							tileBoard[i][j] = 0;
							tileBoard[i - 1][j] = val;
							val = 0;
						}// end of else
					}// end of j loop
				}// end of i loop
			}// end of 5 loop
			try {
				addRandomTile(tileBoard, 2);
			} catch (Exception e) {
				throw new Exception();
			}
			break;
		case "right":
			for (int indx = 0; indx < 5; indx++) {// 5 loop
				for (int i = 0; i < tileBoard.length; i++) {// i loop
					for (int j = 0; j < tileBoard[i].length - 1; j++) {// j loop
						if (tileBoard[i][j + 1] == 0) {
							tileBoard[i][j + 1] = tileBoard[i][j];
							tileBoard[i][j] = 0;
						}// end of if
						else if (tileBoard[i][j + 1] == tileBoard[i][j]) {
							val = tileBoard[i][j + 1] * 2;
							tileBoard[i][j] = 0;
							tileBoard[i][j + 1] = val;
							val = 0;
						}// end of else
					}// end of j loop
				}// end of i loop
			}// end of 5 loop
			try {
				addRandomTile(tileBoard, 2);
			} catch (Exception e) {
				throw new Exception();
			}
			break;
		case "left":
			for (int indx = 0; indx < 5; indx++) {// 5 loop
				for (int i = 0; i < tileBoard.length; i++) {// i loop
					for (int j = 1; j < tileBoard[i].length; j++) {// j loop
						if (tileBoard[i][j - 1] == 0) {
							tileBoard[i][j - 1] = tileBoard[i][j];
							tileBoard[i][j] = 0;
						}// end of if
						else if (tileBoard[i][j - 1] == tileBoard[i][j]) {
							val = tileBoard[i][j - 1] * 2;
							tileBoard[i][j] = 0;
							tileBoard[i][j - 1] = val;
							val = 0;
						}// end of else
					}// end of j loop
				}// end of i loop
			}// end of 5 loop
			try {
				addRandomTile(tileBoard, 2);
			} catch (Exception e) {
				throw new Exception();
			}
			break;
		}

	}

	// toString()
	@Override
	public String toString() {
		return printArray(tileBoard);
	}
}

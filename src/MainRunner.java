import java.util.Random;
import java.util.Scanner;

public class MainRunner {

	public static void main(String[] args) {
		Board board = new Board();
		Random rand = new Random();
		Scanner reader = new Scanner(System.in);
		String controllerResponse = "";

		while (true) {
			try {
				int rando = rand.nextInt(4);
				switch (rando) {
				case 0:
					board.moveTiles("up");
					break;
				case 1:
					board.moveTiles("down");
					break;
				case 2:
					board.moveTiles("right");
					break;
				case 3:
					board.moveTiles("left");
					break;
				}
				if(board.checkForTile(2048)){
					return;
				}
				System.out.println(board.toString());
			} catch (Exception e) {
				System.out.println("There are no Remaining moves\n\tYou Lose!");
				board = new Board();
			}
		}

		/*
		 * System.out.println("Welcome to 2048!");
		 * 
		 * outerLoop: while (true) { controllerResponse = "";
		 * System.out.println(board);
		 * System.out.println("[UP][LEFT][RIGHT][DOWN]"); controllerResponse =
		 * reader.next(); controllerResponse = controllerResponse.toUpperCase();
		 * switch (controllerResponse) { case "UP": try { board.moveTiles("up");
		 * } catch (Exception e) { System.out
		 * .println("There are no more possible moves, YOU LOSE!"); break
		 * outerLoop; } break; case "DOWN": try { board.moveTiles("down"); }
		 * catch (Exception e) { System.out
		 * .println("There are no more possible moves, YOU LOSE!"); break
		 * outerLoop; } break; case "RIGHT": try { board.moveTiles("right"); }
		 * catch (Exception e) { System.out
		 * .println("There are no more possible moves, YOU LOSE!"); break
		 * outerLoop; } break; case "LEFT": try { board.moveTiles("left"); }
		 * catch (Exception e) { System.out
		 * .println("There are no more possible moves, YOU LOSE!"); break
		 * outerLoop; } break; default:
		 * System.out.println("That is not a valid entry"); break; } }
		 */
	}
}

package boardgame;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Board first = new Board();
		start();
		first.printBoard();

	}

	// clears the terminal
	private static void clearCon() {
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

		} catch (Exception e) {
			System.out.println(e);

		}

	}

	// initiates the main menu and starts game
	public static void start() {
		Scanner userInput = new Scanner(System.in);
		int input;

		System.out.println("Mini Battleship!");
		System.out.println("Press Enter to start");
		userInput.nextLine();
		// clearCon();

		System.out.println("Please choose mode: ");
		System.out.println("Enter 1 for: Player vs. Player ");
		System.out.println("Enter 2 for: Player vs. AI ");
		System.out.println("Enter 3 to Exit ");

	}
}
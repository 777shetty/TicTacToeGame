package com.bridgelabz.tictactoegame;
import java.util.Scanner;

public class TicTacToeGame {
	static char board[] = new char[10];
	static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Welcome to TicTacToe Game!");
		boardCreation();
		char userLetter = getInput();
		char computerLetter = userLetter == 'X' ? 'O' : 'X';
		displayBoard();
	}

	public static void boardCreation() {

		board = new char[10];
		for (int index = 1; index < board.length; index++)
			board[index] = ' ';
	}

	public static char getInput() {

		System.out.print("Enter the letter (X or O): ");
		return scanner.next().toUpperCase().charAt(0);
	}

	private static void displayBoard() {

		for (int i = 1; i < 10; i++) {

			System.out.print(" | " + i);
			if (i % 3 == 0) {
				System.out.println(" | ");
			}

		}

	}
}
package com.bridgelabz.tictactoegame;
import java.util.Scanner;

public class TicTacToeGame {
	static char board[] = new char[10];
	static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Welcome to TicTacToe Game!");
		for (int index = 1; index < board.length; index++) {
			board[index] = ' ';
		}
		getInput("Player");
		getInput("Computer");
	}
	
	public static char getInput(String player) {
		System.out.println("");
		System.out.print("Enter the "+ player +" letter (X or O): ");
		char input = scanner.next().toUpperCase().charAt(0);
		return input == 'X'? 'X':'O';
	}
}
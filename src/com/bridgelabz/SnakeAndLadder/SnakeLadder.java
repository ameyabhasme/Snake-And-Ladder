package com.bridgelabz.SnakeAndLadder;

public class SnakeLadder {
	final static int START = 0;

	public static void main(String[] args) {
		System.out.println("Welcome to Snake And Ladder game");
		System.out.println("\nStarting the game with Game Point= " + START);
		int dice = (int) (Math.random() * 6) + 1;
		System.out.println("Dice roll: " + dice);
	}
}
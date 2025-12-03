package battleship;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Board board = new Board(10);
        board.printBoard();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates of the ship:");
        String[] parts = sc.nextLine().split(" ");
        String front = parts[0];
        String back = parts[1];
        try {
            board.validateCoordinates(front);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
        try {
            board.validateCoordinates(back);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;

        }
        // validate if ship is either horizontal or vertical
        try {
            Ship.validateShipPlacement(front, back);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        Ship ship = new Ship(front, back);
        System.out.println(ship);
    }
}

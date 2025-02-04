package org.example;

import org.example.ChessService.StartField;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StartField game = new StartField();
        game.initializeBoard();
        game.printBoard();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter move: startX, startY, endX, endY (comma-separated): ");
        String str = scanner.nextLine();

        try {
            String[] parts = str.split(",");
            if (parts.length != 4) {
                throw new IllegalArgumentException("Invalid input format. Enter four numbers separated by commas.");
            }

            int startX = Integer.parseInt(parts[0].trim());
            int startY = Integer.parseInt(parts[1].trim());
            int endX = Integer.parseInt(parts[2].trim());
            int endY = Integer.parseInt(parts[3].trim());

            System.out.println("\nAttempting to move piece from (" + startX + ", " + startY + ") to (" + endX + ", " + endY + ")");
            boolean success = game.movePiece(startX, startY, endX, endY);

            System.out.println("Move successful: " + success);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        game.printBoard();
    }
}
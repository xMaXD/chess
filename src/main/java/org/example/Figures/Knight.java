package org.example.Figures;

import org.example.ChessService.Piece;

public class Knight extends Piece {
    public Knight(String color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY, Object[][] board) {
        int dx = Math.abs(endX - startX);
        int dy = Math.abs(endY - startY);
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2); // "L" shape
    }

    @Override
    public String getSymbol() {
        return color.equals("white") ? "♘" : "♞";
    }
}

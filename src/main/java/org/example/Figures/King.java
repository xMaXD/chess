package org.example.Figures;

import org.example.ChessService.Piece;

public class King extends Piece {
    public King(String color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY, Object[][] board) {
        int dx = Math.abs(endX - startX);
        int dy = Math.abs(endY - startY);
        if (dx <= 1 && dy <= 1) {
            return board[endX][endY] == null || !((Piece) board[endX][endY]).getColor().equals(this.color);
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return color.equals("white") ? "♔" : "♚";
    }
}


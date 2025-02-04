package org.example.Figures;

import org.example.ChessService.Piece;

public class Queen extends Piece {
    public Queen(String color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY, Object[][] board) {
        int dx = Math.abs(endX - startX);
        int dy = Math.abs(endY - startY);

        if (dx == dy || startX == endX || startY == endY) {
            int xStep = (endX > startX) ? 1 : (endX < startX) ? -1 : 0;
            int yStep = (endY > startY) ? 1 : (endY < startY) ? -1 : 0;

            int x = startX + xStep, y = startY + yStep;
            while (x != endX || y != endY) {
                if (board[x][y] != null) return false;
                x += xStep;
                y += yStep;
            }
            return board[endX][endY] == null || !((Piece) board[endX][endY]).getColor().equals(this.color);
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return color.equals("white") ? "♕" : "♛"; // Unicode symbols for white/black queen
    }
}
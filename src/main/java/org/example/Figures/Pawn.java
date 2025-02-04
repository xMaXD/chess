package org.example.Figures;

import org.example.ChessService.Piece;

public class Pawn extends Piece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY, Object[][] board) {
        int direction = color.equals("white") ? -1 : 1;
        boolean isStartPosition = (color.equals("white") && startX == 6) || (color.equals("black") && startX == 1);

        if (startY == endY) {
            if (endX == startX + direction && board[endX][endY] == null) return true;
            if (isStartPosition && endX == startX + 2 * direction && board[endX][endY] == null) return true;
        } else if (Math.abs(startY - endY) == 1 && endX == startX + direction) {
            if (board[endX][endY] != null && !((Piece) board[endX][endY]).getColor().equals(this.color)) return true;
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return color.equals("white") ? "♙" : "♟";
    }
}

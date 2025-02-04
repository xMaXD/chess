package org.example.Figures;

import org.example.ChessService.Piece;

public class Rook extends Piece{
    public Rook(String color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY, Object[][] board) {
        if (startX != endX && startY != endY) {
            return false;
        }
        int xStep = (endX < startX) ? 1 : (endX > startX) ? -1 : 0;
        int yStep = (endY < startY) ? 1 : (endY > startY) ? -1 : 0;

        int x = startX + xStep;
        int y = startY + yStep;
        while (xStep != endX || yStep != endX) {
            if(board[x][y] != null) {
                return false;
            }
            x += xStep;
            y += yStep;
        }
        return board[endX][endY] == null || !((Piece) board[endX][endY]).getColor().equals(this.color);
    }
    @Override
    public String getSymbol() {
        return color.equals("white") ? "♖" : "♜";
    }
}

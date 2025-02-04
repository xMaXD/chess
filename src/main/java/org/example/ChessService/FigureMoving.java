package org.example.ChessService;

public interface FigureMoving {
    boolean isValidMove(int startX, int startY, int endX, int endY, Object[][] board);
}

package org.example.ChessService;

import org.example.Figures.*;

public class StartField {
    private final Object[][] board = new Object[8][8];

    public void initializeBoard() {
        board[7][0] = new Rook("white");
        board[7][7] = new Rook("white");
        board[7][1] = new Knight("white");
        board[7][6] = new Knight("white");
        board[7][2] = new Bishop("white");
        board[7][5] = new Bishop("white");
        board[7][3] = new Queen("white");
        board[7][4] = new King("white");

        for (int i = 0; i < 8; i++) {
            board[6][i] = new Pawn("white");
        }

        board[0][0] = new Rook("black");
        board[0][7] = new Rook("black");
        board[0][1] = new Knight("black");
        board[0][6] = new Knight("black");
        board[0][2] = new Bishop("black");
        board[0][5] = new Bishop("black");
        board[0][3] = new Queen("black");
        board[0][4] = new King("black");

        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn("black");
        }
    }
    public Object[][] getBoard() {
        return board;
    }
    public boolean movePiece(int startX, int startY, int endX, int endY) {
        if (board[startX][startY] instanceof Piece) {
            Piece piece = (Piece) board[startX][startY];
            if (piece.isValidMove(startX, startY, endX, endY, board) ) {
                board[endX][endY] = piece;
                board[startX][startY] = null;
                return true;
            }
        }
        return false;
    }

    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] instanceof Piece ? ((Piece) board[i][j]).getSymbol() + " " : ". ");
            }
            System.out.println();
        }
    }
}

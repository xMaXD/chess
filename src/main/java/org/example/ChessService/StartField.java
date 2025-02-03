package org.example.ChessService;

import org.example.Figures.*;

public class StartField {
    private final Object[][] startField = new Object[8][8];
    public void start() {
        startField[0][0] = new Rook();
        startField[0][7] = new Rook();
        startField[0][1] = new Knight();
        startField[0][6] = new Knight();
        startField[0][2] = new Bishop();
        startField[0][5] = new Bishop();
        startField[0][3] = new Queen();
        startField[0][4] = new King();
        for (int i = 0; i < startField.length; i++) {
            startField[1][i] = new Pawn();
        }
    }
}

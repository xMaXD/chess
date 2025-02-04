package org.example.ChessService;

import javax.swing.*;

public abstract class Piece implements FigureMoving{
    protected String color;

    public Piece(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public abstract String getSymbol();
}

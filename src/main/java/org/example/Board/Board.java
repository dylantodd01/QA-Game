package org.example.Board;

import org.example.Sprites.Sprite;

import java.sql.Array;

public class Board {
    private int rows;
    private int columns;
    private Sprite[][] boardArray ;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.boardArray = new Sprite[rows][columns];
    }
}

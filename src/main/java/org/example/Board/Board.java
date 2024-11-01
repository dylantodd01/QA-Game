package org.example.Board;

import org.example.Sprites.Sprite;

import javax.swing.text.Position;
import java.awt.*;
import java.util.ArrayList;


public class Board {
    private int rows;
    private int columns;
    private Sprite[][] boardArray ;
    private ArrayList<int[]> availablePositions = new ArrayList<int[]>();


    public Board(int rows, int columns) {
        if (rows < 2 || columns< 2){
            throw new IllegalArgumentException("Size of Rows and Columns should be larger than 2!");
        } else {
            this.rows = rows;
            this.columns = columns;
            this.boardArray = new Sprite[rows][columns];

            // Initialising available positions
            for (int i = 0; i < rows; i++){
                for (int j = 0; j < columns; j++){
                    this.availablePositions.add(new int[]{i,j});
                }
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public Sprite[][] getBoardArray() {
        return boardArray;
    }

    public void setBoardArray(Sprite[][] boardArray) {
        this.boardArray = boardArray;
    }

    // Method to add sprites to position (position[0]-row, position[1]-Column)
    public void addSprite(Sprite sprite, int[] position){
        if (boardArray[position[0]][position[1]] == null){
            boardArray[position[0]][position[1]] = sprite;
            // Remove co-ordinates from list once occupied by Sprite
            availablePositions.remove(position);
        }
        else {
            throw new IllegalStateException("Position is already occupied");
        }
    }

}

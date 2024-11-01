package org.example.gameEngine;


import org.example.Board.Board;
import org.example.Sprites.*;

import java.util.Arrays;

public class Engine {

    void takeTurn() {

    }

    public void printBoard(Board b, Player p) {
        int r = b.getRows(); int c = b.getColumns();
        String horizontalLine = " ----".repeat(Math.max(0, r)) + "  \n";

        StringBuilder printFriendlyBoard = new StringBuilder();

        for (int i = 0; i < r; i++) {
            printFriendlyBoard.append(horizontalLine);

            StringBuilder rowContent = new StringBuilder();
            for (int j = 0; j < c; j++) {
                if (i == (p.)
            }
        }

    }



    public boolean checkWinner(int[] playerPosition, int[] treasurePosition) {
        return (Arrays.equals(playerPosition, treasurePosition));
    }

    public int calcMovesFromTreasureBasic(int[] playerPosition, int[] treasurePosition) {
        if (playerPosition.length != 2 | treasurePosition.length != 2) {
            throw new IllegalArgumentException(
                    "PlayerPosition and treasurePosition coordinates must be in array like {x, y}."
            );
        }
        return Math.abs(treasurePosition[0] - playerPosition[0]) +
                Math.abs(treasurePosition[1] - playerPosition[1]);
    }

}

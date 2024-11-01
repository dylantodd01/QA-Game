package org.example.Sprites;

import java.util.Locale;

public class Player extends Sprite{

    private int minColumn = 1;
    private int minRow = 1;
    private int maxColumn = board.getColumns();
    private int maxRow = board.getRows();

    public Player(int[] position) {
        super(position);
    }

    public void move(String move) {
        switch (move.toLowerCase()){
            case "up":
                int[] newPosition = {getPosition()[0] - 1, getPosition()[1]};
                if (moveAllowed(newPosition)) {
                    setPosition(newPosition);
                }
            case "down":
                int[] newPosition = {getPosition()[0] + 1, getPosition()[1]};
                if (moveAllowed(newPosition)) {
                    setPosition(newPosition);
                }

        }
    }

    private boolean moveAllowed(int[] newPosition) {
        return newPosition[0] >= minRow && newPosition[0] <= maxRow &&
                newPosition[1] >= minColumn && newPosition[1] <= maxColumn;
    }

}

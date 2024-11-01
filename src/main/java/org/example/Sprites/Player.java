package org.example.Sprites;

import java.util.Locale;

public class Player extends Sprite{

    private int score;
    private final int maxColumn = board.getColumns();
    private final int maxRow = board.getRows();

    public Player(int[] position) {
        super(position);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void move(String move) {

        if (move.equalsIgnoreCase("up")) {
            int[] newPosition = {getPosition()[0] - 1, getPosition()[1]};
            if (moveAllowed(newPosition)) {
                setPosition(newPosition);
            }
        } else if (move.equalsIgnoreCase("down")) {
            int[] newPosition = {getPosition()[0] + 1, getPosition()[1]};
            if (moveAllowed(newPosition)) {
                setPosition(newPosition);
            }
        } else if (move.equalsIgnoreCase("left")) {
            int[] newPosition = {getPosition()[0], getPosition()[1] - 1};
            if (moveAllowed(newPosition)) {
                setPosition(newPosition);
            }
        } else if (move.equalsIgnoreCase("right")) {
            int[] newPosition = {getPosition()[0], getPosition()[1] + 1};
            if (moveAllowed(newPosition)) {
                setPosition(newPosition);
            }
        }
    }

    private boolean moveAllowed(int[] newPosition) {
        int minColumn = 1;
        int minRow = 1;
        return newPosition[0] >= minRow && newPosition[0] <= maxRow &&
                newPosition[1] >= minColumn && newPosition[1] <= maxColumn;
    }

}

package org.example.Sprites;

import java.util.Locale;

public class Player extends Sprite{

    public Player(int[] position) {
        super(position);
    }

    public void move(String move) {
        switch (move.toLowerCase()){
            case "up":
                int[] newPosition = {getPosition()[0], getPosition()[1] - 1};
                if (moveAllowed(newPosition)) {
                    setPosition(newPosition);
                }

        }
    }

    private void moveAllowed(int[] newPosition) {
    }

}

package org.example.Sprites;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sprite {

    private String name;
    private int[] position;

    public Sprite(int[] position) {
        this.position = position;
        this.name = "Sprite";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Sprite{" +
                "name='" + name + '\'' +
                ", position=" + Arrays.toString(position) +
                '}';
    }

    public String greeting() {
        return "Hello!";
    }

}

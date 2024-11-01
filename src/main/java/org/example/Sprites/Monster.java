package org.example.Sprites;

public class Monster extends Sprite{

    String type;

    public Monster(int[] position) {
        super(position);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String greeting() {
        return "I am a " + type + " type of monster!";
    }
}

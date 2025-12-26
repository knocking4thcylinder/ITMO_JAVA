package lab34.entities;

import lab34.enums.ClothingStyle;
import lab34.enums.EmotionalState;
import lab34.records.Location;

public class Citizen extends Korotyshka {
    private boolean aggressive;
    private int temperLevel;

    public Citizen(String name, Location location, ClothingStyle style, boolean aggressive) {
        super(name, location, style);
        this.aggressive = aggressive;
        this.temperLevel = 0;
    }

    public boolean isAggressive() {
        return aggressive;
    }

    public int getTemperLevel() {
        return temperLevel;
    }

    public void increaseTemper() {
        this.temperLevel++;
        setState(EmotionalState.ANGRY);
    }

    public void hit(Korotyshka other, String bodyPart) {
        System.out.println(getName() + " бьет " + other.getName() + " по " + bodyPart);
        increaseTemper();
    }

    public void giveBruise(Korotyshka other, String location) {
        System.out.println(getName() + " ставит синяк " + other.getName() + " под " + location);
    }

    public void bite(Policeman policeman) {
        System.out.println(getName() + " кусает " + policeman.getName() + " за руку");
        policeman.getBitten();
    }

    public boolean tryToEscape() {
        System.out.println(getName() + " пытается вырваться");
        return Math.random() > 0.5;
    }
}

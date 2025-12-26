package lab34.entities;

import lab34.enums.ClothingStyle;
import lab34.records.Location;

public class Spectator extends Korotyshka {
    private int curiosityLevel;
    private boolean willingToMove;

    public Spectator(String name, Location location, ClothingStyle style) {
        super(name, location, style);
        this.curiosityLevel = 0;
        this.willingToMove = false;
    }

    public int getCuriosityLevel() {
        return curiosityLevel;
    }

    public boolean isWillingToMove() {
        return willingToMove;
    }

    public void watchConflict(Conflict conflict) {
        curiosityLevel++;
        System.out.println(getName() + " с любопытством наблюдает за конфликтом. Уровень любопытства: " + curiosityLevel);
    }

    public void refuseToDisperse() {
        willingToMove = false;
        System.out.println(getName() + " отказывается расходиться.");
    }
}

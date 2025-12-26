package lab34.entities;

import lab34.records.Location;

import java.util.ArrayList;

public class Crowd {
    private ArrayList<Spectator> spectators;
    private Location location;
    private boolean blocking;

    public Crowd(Location location) {
        this.location = location;
        this.spectators = new ArrayList<>();
        this.blocking = false;
    }

    public void addSpectator(Spectator spectator) {
        spectators.add(spectator);
        System.out.println(spectator.getName() + " присоединился к толпе.");
    }

    public int getSize() {
        return spectators.size();
    }

    public boolean isBlocking() {
        return blocking;
    }

    public void setBlocking(boolean blocking) {
        this.blocking = blocking;
    }

    public boolean disperse() {
        if (spectators.stream().allMatch(Spectator::isWillingToMove)) {
            spectators.clear();
            System.out.println("Толпа разошлась.");
            return true;
        } else {
            System.out.println("Толпа отказывается расходиться.");
            spectators.forEach(Spectator::refuseToDisperse);
            return false;
        }
    }

    public void formInstantly() {
        System.out.println("Моментально образовалась толпа.");
    }
}

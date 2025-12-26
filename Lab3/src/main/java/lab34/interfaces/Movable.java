package lab34.interfaces;

import lab34.records.Location;

public interface Movable {
    void move(Location destination);
    boolean canMove();
}

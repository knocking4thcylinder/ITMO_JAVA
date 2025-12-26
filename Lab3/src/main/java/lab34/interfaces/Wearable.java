package lab34.interfaces;

import lab34.entities.Korotyshka;

public interface Wearable {
    void wear(Korotyshka wearer);
    void takeOff(Korotyshka wearer);
    boolean isFashionable();
}

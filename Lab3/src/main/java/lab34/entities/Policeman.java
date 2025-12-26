package lab34.entities;

import lab34.enums.ClothingStyle;
import lab34.enums.EmotionalState;
import lab34.records.ArrestInfo;
import lab34.records.InjuryDetails;
import lab34.records.Location;

import java.util.ArrayList;

public class Policeman extends Korotyshka {
    private String badge;
    private boolean onDuty;
    private ArrayList<Korotyshka> detained;
    private Conscience conscience;

    public Policeman(String name, Location location, ClothingStyle style, String badge) {
        super(name, location, style);
        this.badge = badge;
        this.onDuty = true;
        this.detained = new ArrayList<>();
        this.conscience = new Conscience();
    }

    public String getBadge() {
        return badge;
    }

    public boolean isOnDuty() {
        return onDuty;
    }

    public void setOnDuty(boolean onDuty) {
        this.onDuty = onDuty;
    }

    public Conscience getConscience() {
        return conscience;
    }

    public void askToDisperse(Crowd crowd) {
        System.out.println(getName() + " просит толпу разойтись.");
        crowd.disperse();
    }

    public void grab(Korotyshka troublemaker) {
        System.out.println(getName() + " хватает за шиворот " + troublemaker.getName());
    }

    public void drag(Korotyshka person, Location destination) {
        System.out.println(getName() + " тащит " + person.getName() + " в " + destination);
        person.move(destination);
    }

    public ArrestInfo arrest(Korotyshka person, int days) {
        person.setInCustody(true);
        detained.add(person);
        System.out.println(getName() + " арестовывает " + person.getName() + " на " + days + " суток.");
        return new ArrestInfo(person, days, new ArrayList<InjuryDetails>());
    }

    public void release(Korotyshka person) {
        person.setInCustody(false);
        detained.remove(person);
        System.out.println(getName() + " освобождает " + person.getName());
    }

    public void getBitten() {
        setState(EmotionalState.ANGRY);
        System.out.println(getName() + " был укушен и очень рассердился.");
    }

    public void getAngry() {
        setState(EmotionalState.ANGRY);
        System.out.println(getName() + " рассердился.");
    }

    public void goHome() {
        System.out.println(getName() + " пошел домой.");
        setOnDuty(false);
    }

    public void sleep() {
        System.out.println(getName() + " лег спать.");
        setState(EmotionalState.SLEEPING);
    }
}

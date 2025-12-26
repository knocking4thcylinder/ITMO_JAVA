package lab34.entities;

import lab34.enums.ClothingStyle;
import lab34.enums.EmotionalState;
import lab34.interfaces.Actionable;
import lab34.interfaces.Movable;
import lab34.records.InjuryDetails;
import lab34.records.Location;
import lab34.util.Action;

import java.util.ArrayList;
import java.util.Objects;

public class Korotyshka extends Entity implements Movable, Actionable {
    private ClothingStyle style;
    private EmotionalState state;
    private ArrayList<Clothing> outfit;
    private ArrayList<InjuryDetails> injuries;
    private boolean inCustody;

    public Korotyshka(String name, Location location, ClothingStyle style) {
        super(name, location);
        this.style = style;
        this.state = EmotionalState.CALM;
        this.outfit = new ArrayList<>();
        this.injuries = new ArrayList<>();
        this.inCustody = false;
    }

    public ClothingStyle getStyle() {
        return style;
    }

    public void setState(EmotionalState state) {
        this.state = state;
        System.out.println("Эмоциональное состояние " + getName() + " теперь: " + state);
    }

    public EmotionalState getState() {
        return state;
    }

    public void wearClothing(Clothing clothing) {
        outfit.add(clothing);
        clothing.wear(this);
    }

    public ArrayList<Clothing> getOutfit() {
        return outfit;
    }

    public void addInjury(InjuryDetails injury) {
        injuries.add(injury);
        System.out.println(getName() + " получает травму: " + injury.description());
    }

    public ArrayList<InjuryDetails> getInjuries() {
        return injuries;
    }

    public boolean isInCustody() {
        return inCustody;
    }

    public void setInCustody(boolean inCustody) {
        this.inCustody = inCustody;
        if (inCustody) {
            System.out.println(getName() + " был взят под стражу.");
        } else {
            System.out.println(getName() + " был освобожден.");
        }
    }

    public void stepOn(Korotyshka other) {
        System.out.println(getName() + " наступает на ногу " + other.getName());
        other.setState(EmotionalState.ANGRY);
    }

    public void insult(Korotyshka other) {
        System.out.println(getName() + " обзывает " + other.getName());
        other.setState(EmotionalState.ANGRY);
    }

    @Override
    public void move(Location destination) {
        if (canMove()) {
            setLocation(destination);
            System.out.println(getName() + " перемещается в " + destination);
        } else {
            System.out.println(getName() + " не может двигаться.");
        }
    }

    @Override
    public boolean canMove() {
        return !inCustody;
    }

    @Override
    public void performAction(Action action) {
        if (canPerformAction(action)) {
            System.out.println(getName() + " выполняет действие: " + action.getDescription());
        } else {
            System.out.println(getName() + " не может выполнить действие: " + action.getDescription());
        }
    }

    @Override
    public boolean canPerformAction(Action action) {
        return state.canPerformAction();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Korotyshka that = (Korotyshka) o;
        return inCustody == that.inCustody &&
                state == that.state &&
                Objects.equals(outfit, that.outfit) &&
                Objects.equals(injuries, that.injuries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), state, outfit, injuries, inCustody);
    }

    @Override
    public String toString() {
        return "Korotyshka{"
                + "name='" + getName() + "'" +
                ", location=" + getLocation() +
                ", state=" + state +
                ", inCustody=" + inCustody +
                '}'
                ;
    }
}

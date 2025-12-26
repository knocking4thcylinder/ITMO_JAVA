package lab34.entities;

import java.util.ArrayList;

public class Conscience {
    private int guiltLevel;
    private boolean active;
    private ArrayList<String> accusations;

    public Conscience() {
        this.guiltLevel = 0;
        this.active = false;
        this.accusations = new ArrayList<>();
    }

    public int getGuiltLevel() {
        return guiltLevel;
    }

    public boolean isActive() {
        return active;
    }

    public void activate() {
        this.active = true;
        System.out.println("Совесть активизировалась.");
    }

    public void deactivate() {
        this.active = false;
        System.out.println("Совесть успокоилась.");
    }

    public void torment(Policeman policeman) {
        if (active) {
            guiltLevel++;
            System.out.println("Совесть мучает " + policeman.getName() + ". Уровень вины: " + guiltLevel);
            causeInsomnia();
        }
    }

    public void addAccusation(String accusation) {
        accusations.add(accusation);
        System.out.println("Совесть добавляет обвинение: " + accusation);
    }

    public void argue(String argument) {
        System.out.println("Совесть спорит: " + argument);
    }

    public void causeInsomnia() {
        System.out.println("Совесть вызывает бессонницу.");
    }
}

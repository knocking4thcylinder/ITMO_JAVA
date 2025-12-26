package lab34.entities;

import lab34.enums.ConflictSeverity;
import lab34.records.InjuryDetails;

import java.util.ArrayList;

public class Conflict {
    private Korotyshka participant1;
    private Korotyshka participant2;
    private ConflictSeverity severity;
    private ArrayList<String> insults;
    private ArrayList<InjuryDetails> injuries;
    private boolean resolved;

    public Conflict(Korotyshka p1, Korotyshka p2) {
        this.participant1 = p1;
        this.participant2 = p2;
        this.severity = ConflictSeverity.MINOR;
        this.insults = new ArrayList<>();
        this.injuries = new ArrayList<>();
        this.resolved = false;
        System.out.println("Начался конфликт между " + p1.getName() + " и " + p2.getName());
    }

    public ConflictSeverity getSeverity() {
        return severity;
    }

    public void escalate() {
        switch (severity) {
            case MINOR:
                severity = ConflictSeverity.MODERATE;
                break;
            case MODERATE:
                severity = ConflictSeverity.SEVERE;
                break;
            case SEVERE:
                severity = ConflictSeverity.CRITICAL;
                break;
        }
        System.out.println("Конфликт обострился до уровня: " + severity);
    }

    public void addInsult(String insult) {
        insults.add(insult);
        System.out.println("В ходе конфликта прозвучало оскорбление: " + insult);
        escalate();
    }

    public void addInjury(InjuryDetails injury) {
        injuries.add(injury);
        System.out.println("В ходе конфликта нанесена травма: " + injury.description());
        escalate();
    }

    public boolean isResolved() {
        return resolved;
    }

    public void resolve() {
        this.resolved = true;
        System.out.println("Конфликт разрешен.");
    }

    public ArrayList<Korotyshka> getParticipants() {
        ArrayList<Korotyshka> participants = new ArrayList<>();
        participants.add(participant1);
        participants.add(participant2);
        return participants;
    }
}

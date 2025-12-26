package lab34.exceptions;

import lab34.entities.Conflict;
import lab34.enums.ConflictSeverity;

public class ConflictEscalationException extends Exception {
    private ConflictSeverity severity;
    private Conflict conflict;

    public ConflictEscalationException(String message, Conflict conflict) {
        super(message);
        this.conflict = conflict;
        this.severity = conflict.getSeverity();
    }

    public ConflictSeverity getSeverity() {
        return severity;
    }

    public Conflict getConflict() {
        return conflict;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " Конфликт достиг уровня: " + severity;
    }
}

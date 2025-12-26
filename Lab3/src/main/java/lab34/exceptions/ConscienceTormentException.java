package lab34.exceptions;

import lab34.entities.Conscience;

public class ConscienceTormentException extends RuntimeException {
    private Conscience conscience;
    private int tormentLevel;

    public ConscienceTormentException(String message, Conscience conscience, int level) {
        super(message);
        this.conscience = conscience;
        this.tormentLevel = level;
    }

    public Conscience getConscience() {
        return conscience;
    }

    public int getTormentLevel() {
        return tormentLevel;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " Уровень мучений совести: " + tormentLevel;
    }
}

package lab34.enums;

public enum ConflictSeverity {
    MINOR(0),
    MODERATE(1),
    SEVERE(3),
    CRITICAL(7);

    private final int arrestDays;

    ConflictSeverity(int arrestDays) {
        this.arrestDays = arrestDays;
    }

    public int getArrestDays() {
        return arrestDays;
    }
}

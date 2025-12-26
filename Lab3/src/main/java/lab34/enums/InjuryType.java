package lab34.enums;

public enum InjuryType {
    HIT_ON_BACK_OF_HEAD(1),
    BRUISE_UNDER_EYE(3),
    BITE_ON_HAND(3),
    STEPPED_ON_FOOT(0);

    private final int arrestDays;

    InjuryType(int arrestDays) {
        this.arrestDays = arrestDays;
    }

    public int getArrestDays() {
        return arrestDays;
    }
}

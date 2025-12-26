package lab34.enums;

public enum TrafficState {
    MOVING(true),
    STOPPED(false),
    CONGESTED(false);

    private final boolean canPass;

    TrafficState(boolean canPass) {
        this.canPass = canPass;
    }

    public boolean canPass() {
        return canPass;
    }
}

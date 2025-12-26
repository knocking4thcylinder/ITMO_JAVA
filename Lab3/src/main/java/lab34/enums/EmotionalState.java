package lab34.enums;

public enum EmotionalState {
    CALM(true),
    ANGRY(false),
    FRUSTRATED(false),
    GUILTY(true),
    TROUBLED(false),
    SLEEPING(true);

    private final boolean canPerformAction;

    EmotionalState(boolean canPerformAction) {
        this.canPerformAction = canPerformAction;
    }

    public boolean canPerformAction() {
        return canPerformAction;
    }
}

package lab34.interfaces;

import lab34.util.Action;

public interface Actionable {
    void performAction(Action action);
    boolean canPerformAction(Action action);
}

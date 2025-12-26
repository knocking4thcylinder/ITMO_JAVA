package lab34.entities;

import lab34.interfaces.StorableItem;

public class Meal implements StorableItem {
    private String type;
    private boolean hot;

    public Meal(String type, boolean hot) {
        this.type = type;
        this.hot = hot;
    }

    public String getType() {
        return type;
    }

    public boolean isHot() {
        return hot;
    }

    public void serve(Korotyshka person) {
        System.out.println(person.getName() + " получает " + type);
    }

    @Override
    public boolean canBeStored() {
        return true;
    }

    @Override
    public int getStorageSpace() {
        return 1;
    }
}

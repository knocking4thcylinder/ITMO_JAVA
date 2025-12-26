package lab34.entities;

import lab34.interfaces.StorableItem;

import java.util.ArrayList;

public class Cabinet {
    private ArrayList<StorableItem> items;
    private boolean locked;

    public Cabinet() {
        this.items = new ArrayList<>();
        this.locked = false;
    }

    public void addItem(StorableItem item) {
        if (item.canBeStored()) {
            items.add(item);
            System.out.println("Предмет добавлен в шкаф.");
        }
    }

    public StorableItem removeItem(StorableItem item) {
        if (items.remove(item)) {
            System.out.println("Предмет извлечен из шкафа.");
            return item;
        }
        return null;
    }

    public boolean isLocked() {
        return locked;
    }

    public void lock() {
        this.locked = true;
    }

    public void unlock() {
        this.locked = false;
    }

    public boolean contains(StorableItem item) {
        return items.contains(item);
    }
}

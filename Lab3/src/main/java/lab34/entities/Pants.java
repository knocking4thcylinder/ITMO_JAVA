package lab34.entities;

import lab34.enums.ClothingStyle;

public class Pants extends Clothing {

    public Pants(String color, ClothingStyle style, boolean wide) {
        super("Брюки", color, style);
        setWide(wide);
    }

    @Override
    public boolean isWide() {
        return super.isWide();
    }
}

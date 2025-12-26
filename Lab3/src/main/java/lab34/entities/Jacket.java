package lab34.entities;

import lab34.enums.ClothingStyle;

public class Jacket extends Clothing {

    public Jacket(String color, ClothingStyle style, boolean narrowSleeves) {
        super("Пиджак", color, style);
        setNarrow(narrowSleeves);
    }

    public boolean hasNarrowSleeves() {
        return super.isNarrow();
    }
}

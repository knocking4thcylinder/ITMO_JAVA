package lab34.enums;

public enum ClothingStyle {
    MODERN("Современный"),
    CLASSIC("Классический"),
    CASUAL("Повседневный"),
    OLD_FASHIONED("Старомодный");

    private final String description;

    ClothingStyle(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

package lab34.enums;

public enum BookType {
    ANCIENT_LAWS(true),
    MODERN_LAWS(true),
    REGULATIONS(true),
    HISTORY(false);

    private final boolean isLegal;

    BookType(boolean isLegal) {
        this.isLegal = isLegal;
    }

    public boolean isLegal() {
        return isLegal;
    }
}

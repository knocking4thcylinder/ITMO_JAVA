package lab34.entities;

import lab34.enums.ClothingStyle;
import lab34.interfaces.Wearable;

import java.util.Objects;

public class Clothing extends Entity implements Wearable {
    private String type;
    private String color;
    private ClothingStyle style;
    private boolean narrow;
    private boolean wide;

    public Clothing(String type, String color, ClothingStyle style) {
        super(type, null);
        this.type = type;
        this.color = color;
        this.style = style;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public ClothingStyle getStyle() {
        return style;
    }

    public boolean isNarrow() {
        return narrow;
    }

    public boolean isWide() {
        return wide;
    }

    public void setNarrow(boolean narrow) {
        this.narrow = narrow;
    }

    public void setWide(boolean wide) {
        this.wide = wide;
    }

    @Override
    public void wear(Korotyshka wearer) {
        System.out.println(wearer.getName() + " надевает " + getName());
    }

    @Override
    public void takeOff(Korotyshka wearer) {
        System.out.println(wearer.getName() + " снимает " + getName());
    }

    @Override
    public boolean isFashionable() {
        return style == ClothingStyle.MODERN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Clothing clothing = (Clothing) o;
        return narrow == clothing.narrow &&
                wide == clothing.wide &&
                Objects.equals(type, clothing.type) &&
                Objects.equals(color, clothing.color) &&
                style == clothing.style;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, color, style, narrow, wide);
    }

    @Override
    public String toString() {
        return "Clothing{"
                + "name='" + getName() + "'" +
                ", location=" + getLocation() +
                ", type='" + type + "'" +
                ", color='" + color + "'" +
                ", style=" + style +
                ", narrow=" + narrow +
                ", wide=" + wide +
                '}';
    }
}

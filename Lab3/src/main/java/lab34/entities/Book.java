package lab34.entities;

import lab34.enums.BookType;
import lab34.interfaces.Readable;
import lab34.interfaces.StorableItem;
import lab34.records.LawRecord;

import java.util.ArrayList;
import java.util.Objects;

public class Book extends Entity implements Readable, StorableItem {
    private String title;
    private BookType type;
    private ArrayList<LawRecord> laws;
    private int ageYears;

    public Book(String title, BookType type) {
        super(title, null);
        this.title = title;
        this.type = type;
        this.laws = new ArrayList<>();
        this.ageYears = 0;
    }

    public String getTitle() {
        return title;
    }

    public BookType getType() {
        return type;
    }

    public void addLaw(LawRecord law) {
        laws.add(law);
    }

    public ArrayList<LawRecord> getLaws() {
        return laws;
    }

    public LawRecord findLaw(String offense) {
        for (LawRecord law : laws) {
            if (law.offense().equalsIgnoreCase(offense)) {
                return law;
            }
        }
        return null;
    }

    public int getAgeYears() {
        return ageYears;
    }

    public void setAgeYears(int ageYears) {
        this.ageYears = ageYears;
    }

    @Override
    public String read() {
        return "Читается содержимое книги: " + title;
    }

    @Override
    public String getContent() {
        StringBuilder content = new StringBuilder();
        for (LawRecord law : laws) {
            content.append(law.toString()).append("\n");
        }
        return content.toString();
    }

    @Override
    public boolean canBeStored() {
        return true;
    }

    @Override
    public int getStorageSpace() {
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return ageYears == book.ageYears &&
                Objects.equals(title, book.title) &&
                type == book.type &&
                Objects.equals(laws, book.laws);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), title, type, laws, ageYears);
    }

    @Override
    public String toString() {
        return "Book{"
                + "name='" + getName() + "'" +
                ", location=" + getLocation() +
                ", title='" + title + "'" +
                ", type=" + type +
                ", ageYears=" + ageYears +
                '}';
    }
}

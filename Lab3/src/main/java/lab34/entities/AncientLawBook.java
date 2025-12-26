package lab34.entities;

import lab34.enums.BookType;
import lab34.records.InjuryDetails;

import java.util.ArrayList;

public class AncientLawBook extends Book {
    private boolean storedInCabinet;

    public AncientLawBook(String title) {
        super(title, BookType.ANCIENT_LAWS);
        setAgeYears(500);
        this.storedInCabinet = true;
    }

    public boolean isStoredInCabinet() {
        return storedInCabinet;
    }

    public void retrieveFromCabinet(Cabinet cabinet) {
        if (cabinet.contains(this)) {
            cabinet.removeItem(this);
            this.storedInCabinet = false;
            System.out.println("Книга '" + getTitle() + "' извлечена из шкафа.");
        }
    }

    public int calculateArrestDays(ArrayList<InjuryDetails> offenses) {
        int totalDays = 0;
        for (InjuryDetails offense : offenses) {
            totalDays += offense.type().getArrestDays();
        }
        return totalDays;
    }
}

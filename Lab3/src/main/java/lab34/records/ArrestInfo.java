package lab34.records;

import lab34.entities.Korotyshka;
import java.util.ArrayList;

public record ArrestInfo(Korotyshka arrested, int totalDays, ArrayList<InjuryDetails> offenses) {
}

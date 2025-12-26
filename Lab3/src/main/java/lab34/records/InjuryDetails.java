package lab34.records;

import lab34.enums.InjuryType;

public record InjuryDetails(InjuryType type, int severity, String description) {
}

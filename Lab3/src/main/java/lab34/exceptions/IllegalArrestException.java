package lab34.exceptions;

import lab34.records.ArrestInfo;

public class IllegalArrestException extends Exception {
    private ArrestInfo arrestInfo;

    public IllegalArrestException(String message, ArrestInfo info) {
        super(message);
        this.arrestInfo = info;
    }

    public ArrestInfo getArrestInfo() {
        return arrestInfo;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

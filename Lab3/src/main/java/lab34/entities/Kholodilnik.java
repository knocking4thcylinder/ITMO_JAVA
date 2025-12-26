package lab34.entities;

public class Kholodilnik extends Room {
    private String originStory;
    private boolean originKnown;

    public Kholodilnik() {
        super("Отдельная комнатка", "холодильником");
        this.originStory = "Происхождение этого названия было теперь уже никому не известно.";
        this.originKnown = false;
        setTemperature(20);
    }

    public String getOriginStory() {
        return originStory;
    }

    public boolean isOriginKnown() {
        return originKnown;
    }

    public void confine(Korotyshka person) {
        addOccupant(person);
        lock();
        System.out.println(person.getName() + " помещен в 'холодильник'.");
    }

    public boolean hasNormalTemperature() {
        return getTemperature() > 18;
    }
}

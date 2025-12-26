package lab34.entities;

import lab34.records.ArrestInfo;

import java.util.ArrayList;

public class PoliceStation extends Entity {
    private ArrayList<Policeman> officers;
    private Kholodilnik kholodilnik;
    private Cabinet cabinet;
    private Cafeteria cafeteria;

    public PoliceStation(String address) {
        super(address, null);
        this.officers = new ArrayList<>();
        this.kholodilnik = new Kholodilnik();
        this.cabinet = new Cabinet();
        this.cafeteria = new Cafeteria("Столовая");
    }

    public Kholodilnik getKholodilnik() {
        return kholodilnik;
    }

    public Cabinet getCabinet() {
        return cabinet;
    }

    public Cafeteria getCafeteria() {
        return cafeteria;
    }

    public void addOfficer(Policeman officer) {
        officers.add(officer);
    }

    public void processArrest(ArrestInfo info) {
        System.out.println("Обработка ареста " + info.arrested().getName() + " в " + getName());
        kholodilnik.confine(info.arrested());
    }
}

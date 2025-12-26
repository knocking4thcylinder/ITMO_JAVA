package lab34.entities;

import lab34.enums.TrafficState;

import java.util.ArrayList;

public class Street extends Entity {
    private TrafficState trafficState;
    private ArrayList<Korotyshka> pedestrians;

    public Street(String name) {
        super(name, null);
        this.trafficState = TrafficState.MOVING;
        this.pedestrians = new ArrayList<>();
    }

    public TrafficState getTrafficState() {
        return trafficState;
    }

    public void setTrafficState(TrafficState trafficState) {
        this.trafficState = trafficState;
        System.out.println("Состояние движения на улице " + getName() + ": " + trafficState);
    }

    public void addPedestrian(Korotyshka person) {
        pedestrians.add(person);
        person.setLocation(this.getLocation());
    }

    public void removePedestrian(Korotyshka person) {
        pedestrians.remove(person);
    }

    public void stopTraffic() {
        setTrafficState(TrafficState.STOPPED);
        System.out.println("Движение транспорта на улице " + getName() + " остановлено.");
    }

    public void resumeTraffic() {
        setTrafficState(TrafficState.MOVING);
        System.out.println("Движение транспорта на улице " + getName() + " возобновлено.");
    }
}

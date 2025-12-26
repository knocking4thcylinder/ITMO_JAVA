package lab34.entities;

import java.util.ArrayList;
import java.util.Objects;

public class Room extends Entity {
    private String roomName;
    private String nickname;
    private boolean locked;
    private ArrayList<Korotyshka> occupants;
    private int temperature;

    public Room(String roomName, String nickname) {
        super(roomName, null);
        this.roomName = roomName;
        this.nickname = nickname;
        this.locked = false;
        this.occupants = new ArrayList<>();
        this.temperature = 20;
    }

    public String getRoomName() {
        return roomName;
    }

    public String getNickname() {
        return nickname;
    }

    public boolean isLocked() {
        return locked;
    }

    public void lock() {
        this.locked = true;
        System.out.println("Комната '" + roomName + "' заперта.");
    }

    public void unlock() {
        this.locked = false;
        System.out.println("Комната '" + roomName + "' отперта.");
    }

    public void addOccupant(Korotyshka person) {
        occupants.add(person);
        System.out.println(person.getName() + " вошел в комнату '" + roomName + "'");
    }

    public void removeOccupant(Korotyshka person) {
        occupants.remove(person);
        System.out.println(person.getName() + " покинул комнату '" + roomName + "'");
    }

    public ArrayList<Korotyshka> getOccupants() {
        return occupants;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Room room = (Room) o;
        return locked == room.locked &&
                temperature == room.temperature &&
                Objects.equals(roomName, room.roomName) &&
                Objects.equals(nickname, room.nickname) &&
                Objects.equals(occupants, room.occupants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), roomName, nickname, locked, occupants, temperature);
    }

    @Override
    public String toString() {
        return "Room{"
                + "name='" + getName() + "'"
                + ", location=" + getLocation() + 
                ", roomName='" + roomName + "'"
                + ", nickname='" + nickname + "'"
                + ", locked=" + locked + 
                ", temperature=" + temperature + 
                '}';
    }
}

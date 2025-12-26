package lab34.entities;

import lab34.records.Location;

import java.util.Objects;

public abstract class Entity {
    private String name;
    private Location location;

    public Entity(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return Objects.equals(name, entity.name) &&
                Objects.equals(location, entity.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location);
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + "'" +
                ", location=" + location + 
                '}';
    }
}

package lab34.exceptions;

import lab34.entities.Room;

public class RoomLockedException extends RuntimeException {
    private Room room;

    public RoomLockedException(String message, Room room) {
        super(message);
        this.room = room;
    }

    public Room getRoom() {
        return room;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " Комната '" + room.getRoomName() + "' заперта.";
    }
}

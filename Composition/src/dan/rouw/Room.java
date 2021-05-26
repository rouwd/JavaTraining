package dan.rouw;

public class Room {
    private int width;
    private int length;
    private String flooring;
    private Door door;

    public Room(int width, int length, String flooring, Door door) {
        this.width = width;
        this.length = length;
        this.flooring = flooring;
        this.door = door;
    }

    public void openDoor() {
        this.door.open();
    }

    public void closeDoor() {
        this.door.close();
    }

    public boolean isDoorOpen() {
        return this.door.isOpen();
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String getFlooring() {
        return flooring;
    }
}

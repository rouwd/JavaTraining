package dan.rouw;

public class House {
    private String color;
    private int stories;
    private String style;
    private Room livingRoom;
    private Room bathroom;

    public House(String color, int stories, String style, Room livingRoom, Room bathroom) {
        this.color = color;
        this.stories = stories;
        this.style = style;
        this.livingRoom = livingRoom;
        this.bathroom = bathroom;
    }

    public void openBathroomDoor() {
        System.out.println("Opening bathroom door");
        this.bathroom.openDoor();
    }

    public void closeBathroomDoor() {
        System.out.println("Closng bathroom door");
        this.bathroom.closeDoor();
    }

    public boolean isBathroomDoorOpen() {
        return this.bathroom.isDoorOpen();
    }

    public void openLivingRoomDoor() {
        System.out.println("Opening bathroom door");
        this.livingRoom.openDoor();
    }

    public void closeLivingRoomDoor() {
        System.out.println("Closng bathroom door");
        this.livingRoom.closeDoor();
    }

    public boolean isLivingRoomDoorOpen() {
        return this.livingRoom.isDoorOpen();
    }

    public String getColor() {
        return color;
    }

    public int getStories() {
        return stories;
    }

    public String getStyle() {
        return style;
    }
}

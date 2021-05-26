package dan.rouw;

public class Door {
    private String color;
    private String material;
    private boolean open;

    public Door(String color, String material, boolean open) {
        this.color = color;
        this.material = material;
        this.open = open;
    }

    public void close() {
        this.open = false;
    }

    public void open() {
        this.open = true;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isOpen() {
        return open;
    }
}

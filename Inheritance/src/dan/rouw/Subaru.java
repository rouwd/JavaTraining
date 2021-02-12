package dan.rouw;

public class Subaru extends Car {
    private int eyeSight;
    private String model;

    public Subaru(String color, int eyeSight, String model) {
        super(color, "Subaru", 4);
        this.eyeSight = eyeSight;
        this.model = model;
    }

    public void enableEyeSight() {
        this.eyeSight = 1;
    }

    public void disableEyeSight() {
        this.eyeSight = 0;
    }

    public int getEyeSight() {
        return eyeSight;
    }

    public void setEyeSight(int eyeSight) {
        this.eyeSight = eyeSight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

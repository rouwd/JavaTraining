package dan.rouw;

public class Contact2 {
    private String name;
    private String phoneNumber;

    public Contact2(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getInfo() {
        return getName() + " : " + getPhoneNumber();
    }

    public void updateInfo(String name, String phoneNumber) {
        setName(name);
        setPhoneNumber(phoneNumber);
    }

    public String getName() {
        return name;
    }

    private String getPhoneNumber() {
        return phoneNumber;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

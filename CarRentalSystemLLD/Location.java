public class Location {
    private String address;
    private String pincode;

    // Constructor
    public Location(String address, String pincode) {
        this.address = address;
        this.pincode = pincode;
    }

    // Getters
    public String getAddress() {
        return address;
    }

    public String getPincode() {
        return pincode;
    }
}

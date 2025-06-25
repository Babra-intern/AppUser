public class Driver extends AppUser {

    public String lincenseNumberString;
    
    public String vehicleInfo;

    public Driver(String name, String phoneNumber, String lincenseNumberString, String vehicleInfo) {
        super(name, phoneNumber);
        this.lincenseNumberString = lincenseNumberString;
        this.vehicleInfo = vehicleInfo;
    }

    public Driver(String name) {
        super(name, "xxxxxxxxxx");
        this.lincenseNumberString = "xxxxxxx";
        this.vehicleInfo = "Car";
    }

    String getUserType() {
        return "Driver";
    }

    @Override
    public String toString() {
        return "\nDriver Info " + "\nName :" + getName() + "\nPhoneNumber :" + getPhoneNumber()
                + "\nlincenseNumberString: " + lincenseNumberString +
                "\nvehicleInfo: " + vehicleInfo;
    }

}
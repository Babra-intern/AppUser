public class Driver extends AppUser {
    
    String lincenseNumberString;
    String vehicleInfo;

    public Driver( String name , String phoneNumber ,String lincenseNumberString,String vehicleInfo){
        super(name,phoneNumber);
        this.lincenseNumberString = lincenseNumberString;
        this.vehicleInfo = vehicleInfo;
    }


    public Driver(String name){
        super(name,"xxxxxxxxxx");
        this.lincenseNumberString = "xxxxxxx";
        this.vehicleInfo = "Car";
    }

    String getUserType(){
        return "Driver";

    }

    @Override
    public String toString(){
        return "Driver Info " + "\nName :" + name + "\nPhoneNumber :" + phoneNumber + "\nlincenseNumberString" + lincenseNumberString +
        "\nvehicleInfo" + vehicleInfo;
    }
    

}
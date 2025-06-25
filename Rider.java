public class Rider extends AppUser implements PaymentCapable {

    public String preferredPaymentMethod;
    public int rideCount;

    public Rider(String name, String phoneNumber, int rideCount, String preferredPaymentMethod) {
        super(name, phoneNumber);
        this.rideCount = rideCount;
        this.preferredPaymentMethod = preferredPaymentMethod;
    }

    public Rider(String name) {
        super(name, "xxxxxxxxxx");
        this.rideCount = 0;
        this.preferredPaymentMethod = "Mobile Money";
    }

    public void processPayment(double amount) {
        System.out.println("\n" + getName() + " paid " + amount + " GH via " + preferredPaymentMethod);
    }

    String getUserType() {
        return "Rider";
    }

    @Override
    public String toString() {
        return "\nRider Info " + "\nName :" + getName() + "\nPhoneNumber :" + getPhoneNumber() + "\nPaymentMethod: "
                + preferredPaymentMethod +
                "\nRideCount: " + rideCount;
    }

}
abstract class AppUser {
    final String userId = "";

    private String name;

    private String phoneNumber;

    abstract String getUserType();

    public AppUser(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    final void displayProfile() {
        System.out.println("\nUser details \n" + "Username :" + name + "\nPhonenumber :" + phoneNumber);
    }
}

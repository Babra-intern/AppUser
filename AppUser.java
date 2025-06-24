abstract class AppUser {

    final String userId = "1";

    String name ;
    String phoneNumber;

    public AppUser(String name, String phoneNumber){
        this.name = name ;
        this.phoneNumber = phoneNumber;
    }

    abstract String getUserType();

    final void displayProfile(){
        System.out.println("\nUser details \n"+ "Username :" + name + "\nPhonenumber :" + phoneNumber);
    }


    
} 
     

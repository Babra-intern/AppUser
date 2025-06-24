public class Main {
    
    public static void main(String [] args){
        Driver driver1 = new Driver("Beatrice");
        driver1.displayProfile();


        Driver driver2 = new Driver("Beatrice","000000000","A-25","red car");
        driver2.displayProfile();
        System.out.println(driver2.toString());


        Rider rider1 = new Rider("Abraham");
        System.out.println(rider1.toString());
        rider1.processPayment(20.0);
       
    }
}

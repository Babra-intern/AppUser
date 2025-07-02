package SolidPrinciples.Task5;

public class Database implements DatabaseInterface {

    @Override
    public void view(String UserID) {
        if(UserID == "1"){
        System.out.println("\nAdmin Dashboard");
        }else{
            System.out.println("\nUser Dashbaord");
        }
    }

}

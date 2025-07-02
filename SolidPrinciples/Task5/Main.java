package SolidPrinciples.Task5;

public class Main {
    public static void main(String[] args){
    Database db = new Database();

    UserService user = new UserService(db);
    user.showDashboard("9");
    }
    
}

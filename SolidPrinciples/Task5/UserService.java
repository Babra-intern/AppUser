package SolidPrinciples.Task5;

public class UserService {
    private DatabaseInterface database;

    public UserService(DatabaseInterface database) {
        this.database = database;
    }

    public void showDashboard(String UserId) {
        database.view(UserId);
    }
}

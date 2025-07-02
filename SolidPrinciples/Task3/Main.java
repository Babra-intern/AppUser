package SolidPrinciples.Task3;

public class Main {
    public static void main(String[] args) {

        // Task 1
        // Report report = new Report();
        // report.Report_generate();

        // Task 3
        Bird sparrow = new Sparrow();

        Bird penguin = new Penguin();

        if (sparrow instanceof CanFly) {
            ((CanFly) sparrow).Fly();
        }

          if (penguin instanceof CanFly) {
            ((CanFly) sparrow).Fly();
        }
    }
}

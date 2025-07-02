package SolidPrinciples.Task1;

import java.util.Scanner;

public class Report {

    public void Report_generate() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter Student's Name :");
        String name = input.nextLine();

        System.out.println("\nEnter the Subject");
        String subject = input.nextLine();

        System.out.println("\nEnter the score");

        double score = input.nextDouble();

        String content = "\nName : " + name +
                "\nSubject :" + subject +
                "\nScore  :" + score;

        SaveFile filesaver = new SaveFile();
        filesaver.saveReport(content);

        input.close();

    }

}

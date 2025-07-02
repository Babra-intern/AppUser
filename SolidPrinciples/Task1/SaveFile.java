package SolidPrinciples.Task1;
import java.io.FileWriter;
import java.io.IOException;

public class SaveFile {


    public void saveReport(String content){
         try{
        FileWriter writeFile = new FileWriter("document.txt");

        writeFile.write(content +"\n\n");
        writeFile.close();
        System.out.println("Report saved successfully");

    } catch(IOException e){
        System.out.println("Error");
    }

   


    }
    
}

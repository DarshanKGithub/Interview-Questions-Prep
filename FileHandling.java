import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        // Create a new File

        // try {
        // File myFile = new File("new.txt");
        // myFile.createNewFile();
        // } catch (IOException e) {
        // System.out.println(e.getMessage());
        // }

        // }

        // Write a file

        // try {
        // FileWriter fileWriter = new FileWriter("new.txt");
        // fileWriter.write("I'm Devil!!");
        // fileWriter.close();
        // } catch (IOException e) {
        // System.out.println(e.getMessage());
        // }

        // Read a file

        // File myFile = new File("new.txt");
        // try {
        // Scanner sc = new Scanner(myFile);
        // while (sc.hasNextLine()) {
        // String line = sc.nextLine();
        // System.out.println(line);
        // }
        // sc.close();

        // } catch (IOException e) {
        // System.out.println(e.getMessage());
        // }

        // Deleting the file

        File myFile = new File("new.txt");
        if (myFile.delete()) {
            System.out.println("I have deleted " + myFile.getName());
        } else {
            System.out.println("Some error issue occured");
        }
    }
}
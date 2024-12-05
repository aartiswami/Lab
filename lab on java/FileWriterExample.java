import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        // Define the file to write to
        String filePath = "output.txt";

        // Writing data to the file using BufferedWriter
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Hello, this is an example of writing data to a file using BufferedWriter.");
            writer.newLine();  // To add a new line after the text
            writer.write("This is another line.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Data has been written to the file.");
    }
}

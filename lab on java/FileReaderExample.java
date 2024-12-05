import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        // Define the file to read from
        String filePath = "output.txt";

        // Reading data from the file using BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);  // Print each line to the console
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Hello, this is a simple Java application!");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }
}

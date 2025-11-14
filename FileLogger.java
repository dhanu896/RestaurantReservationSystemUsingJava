package restaurant.utils;
import java.io.*;

public class FileLogger {
    public static void log(String message) {
        try (FileWriter fw = new FileWriter("reservations.log", true)) {
            fw.write(message + "\n");
        } catch (IOException e) {
            System.out.println("Error writing log: " + e.getMessage());
        }
    }
}

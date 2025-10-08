import java.io.*;
import java.util.*;

public class FileManager {
    private static final String FILE_NAME = "farmers.dat";

    @SuppressWarnings("unchecked")
    public static List<Farmer> loadFarmers() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Farmer>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public static void saveFarmers(List<Farmer> farmers) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(farmers);
        } catch (IOException e) {
            System.out.println(" Error saving farmer data: " + e.getMessage());
        }
    }
}

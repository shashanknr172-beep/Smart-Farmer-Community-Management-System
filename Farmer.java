import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Farmer implements Serializable {
    private String id;
    private String name;
    private String location;
    private List<Crop> crops;

    public Farmer(String id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.crops = new ArrayList<>();
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getLocation() { return location; }
    public List<Crop> getCrops() { return crops; }

    public void addCrop(Crop crop) {
        crops.add(crop);
    }

    @Override
    public String toString() {
        return " Farmer ID: " + id + " | Name: " + name + " | Location: " + location +
               "\nCrops: " + (crops.isEmpty() ? "None" : crops);
    }
}

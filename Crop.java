import java.io.Serializable;

public class Crop implements Serializable {
    private String cropName;
    private double yield; // in tons
    private double price; // per ton

    public Crop(String cropName, double yield, double price) {
        this.cropName = cropName;
        this.yield = yield;
        this.price = price;
    }

    public String getCropName() { return cropName; }
    public double getYield() { return yield; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return cropName + " (Yield: " + yield + "t, Price: ₹" + price + "/t)";
    }
}

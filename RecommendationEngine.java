import java.util.*;

public class RecommendationEngine {
    private static final Map<String, String> cropSuggestions = Map.of(
        "Wheat", "Next crop: Soybean for soil nitrogen enrichment.",
        "Rice", "Next crop: Pulses to prevent soil depletion.",
        "Corn", "Next crop: Groundnut for better rotation.",
        "Sugarcane", "Next crop: Wheat or legume crops for balance."
    );

    public static void suggestNextCrop(Farmer farmer) {
        if (farmer.getCrops().isEmpty()) {
            System.out.println(" Suggestion: Start with high-demand crops like Rice or Wheat.");
            return;
        }

        Crop lastCrop = farmer.getCrops().get(farmer.getCrops().size() - 1);
        System.out.println(" Based on your last crop (" + lastCrop.getCropName() + "):");
        System.out.println(cropSuggestions.getOrDefault(lastCrop.getCropName(),
                "No specific suggestion. Try soil testing for best match."));
    }
}

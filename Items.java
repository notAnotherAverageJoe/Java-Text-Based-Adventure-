import java.util.Random;

public class Items {
    private String common;
    private String normal;
    private String rare;
    private String epic;
    private String legendary;

    public Items(String common, String normal, String rare, String epic, String legendary) {
        this.common = common;
        this.normal = normal;
        this.rare = rare;
        this.epic = epic;
        this.legendary = legendary;
    }

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    public String getNormal() {
        return normal;
    }

    public void setNormal(String normal) {
        this.normal = normal;
    }

    public String getRare() {
        return rare;
    }

    public void setRare(String rare) {
        this.rare = rare;
    }

    public String getEpic() {
        return epic;
    }

    public void setEpic(String epic) {
        this.epic = epic;
    }

    public String getLegendary() {
        return legendary;
    }

    public void setLegendary(String legendary) {
        this.legendary = legendary;
    }

    public String generateRandomItem() {
        Random rand = new Random();
        int itemType = rand.nextInt(5); // Generate a number between 0 and 4

        switch (itemType) {
            case 0:
                return common;
            case 1:
                return normal;
            case 2:
                return rare;
            case 3:
                return epic;
            case 4:
                return legendary;
            default:
                return null; // This case should never be reached
        }
    }

    // Method to get item usage description
    public String getItemUsage(String item) {
        switch (item) {
            case "common":
                return "A common item. It's not very valuable but might come in handy.";
            case "normal":
                return "A normal item. It's of average quality and can be used for basic tasks.";
            case "rare":
                return "A rare item. It's valuable and might have special properties.";
            case "epic":
                return "An epic item. It's very valuable and has powerful properties.";
            case "legendary":
                return "A legendary item. It's extremely valuable and has extraordinary properties.";
            default:
                return "Unknown item.";
        }
    }

}

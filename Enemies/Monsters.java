package Enemies;

public class Monsters {
    private String name;
    private int powerLevel;
    private String species;
    private int health;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Monsters(String name, int powerLevel, String species, int health) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.species = species;
        this.health = health;
    }

}

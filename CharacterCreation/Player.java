package CharacterCreation;

import java.util.Scanner;

public class Player {
    private String firstName;
    private String lastName;
    private String playerRace;
    private String playerClass;
    private int level;

    private static Scanner in = new Scanner(System.in);

    public Player(String firstName, String lastName, int level, String playerRace, String playerClass) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.playerRace = playerRace;
        this.playerClass = playerClass;
        this.level = level;
    }

    // Getter and setter methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getLevel() {
        return level;
    }

    public String getPlayerRace() {
        return playerRace;
    }

    public void setPlayerRace(String playerRace) {
        this.playerRace = playerRace;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    public void setLevel(int level) {
        if (level > 0) { // Basic validation
            this.level = level;
        } else {
            System.out.println("Level must be positive.");
        }
    }

    // Method to interact with the user
    public void creation() {
        System.out.println("Welcome Adventurer!");
        System.out.println("Tell me, adventurer, what is your first name?");
        this.firstName = in.nextLine();

        System.out.println("Might I ask you for your last name as well?");
        this.lastName = in.nextLine();

        System.out.println("What is your current level?");
        while (!in.hasNextInt()) {
            System.out.println("Please enter a valid level.");
            in.next(); // Clear invalid input
        }
        this.level = in.nextInt();
        in.nextLine(); // Consume the remaining newline

        System.out.println("\n\nTell me " + getFirstName() + ", what race are you?");
        System.out.println("1: Dwarf\n2: Human\n3: Elf\n4: Orc\n5: Slime");
        int raceChoice = in.nextInt();
        in.nextLine(); // Consume the newline character

        switch (raceChoice) {
            case 1:
                this.playerRace = "Dwarf";
                break;
            case 2:
                this.playerRace = "Human";
                break;
            case 3:
                this.playerRace = "Elf";
                break;
            case 4:
                this.playerRace = "Orc";
                break;
            case 5:
                this.playerRace = "Slime";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Human.");
                this.playerRace = "Human";
        }

        // Prompt for class selection
        System.out.println("\nWhat is your combat style? (your class): ");
        System.out.println("Choose\n1: Warrior\n2: Mage\n3: Rogue\n(type 1-3)");
        int classChoice = in.nextInt();
        in.nextLine(); // Consume the newline character

        switch (classChoice) {
            case 1:
                this.playerClass = "Warrior";
                break;
            case 2:
                this.playerClass = "Mage";
                break;
            case 3:
                this.playerClass = "Rogue";
                break;
            default:
                System.out.println("Invalid choice, defaulting to Farmer.");
                this.playerClass = "Farmer";
        }

        System.out.println("Welcome, " + firstName + " " + lastName + "!");
        System.out.println("Your current level is " + level + ".");
        System.out.println("You have chosen: " + playerRace + " as your race.");
        System.out.println("You have chosen: " + playerClass + " as your class.");
    }

    // Method to display character information
    public void displayCharacter() {
        System.out.println("\nCharacter Information:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Level: " + level);
        System.out.println("Race: " + playerRace);
        System.out.println("Class: " + playerClass);
    }

}

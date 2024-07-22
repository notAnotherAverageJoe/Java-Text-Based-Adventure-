import java.util.Scanner;

import CharacterCreation.Player;

public class Game {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Items items = new Items("common", "normal", "rare", "epic", "legendary");

        System.out.println("Welcome Adventurer!\n");
        Player hero = new Player(null, null, 0, null, null);
        hero.creation();
        hero.displayCharacter();

        // Generate a random item
        String randomItem = items.generateRandomItem();
        System.out.println("You found a " + randomItem + " item.");

        // Get the usage of the random item
        String itemUsage = items.getItemUsage(randomItem);
        System.out.println(itemUsage);

    }

}

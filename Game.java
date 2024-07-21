import java.util.Scanner;

import CharacterCreation.Player;

public class Game {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome Adventurer!\n");
        Player hero = new Player(null, null, 0, null, null);
        hero.creation();
        hero.displayCharacter();

    }

}

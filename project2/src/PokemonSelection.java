import java.util.Scanner;

public class PokemonSelection {
    private Scanner scanner;

    public PokemonSelection() {
        scanner = new Scanner(System.in);
    }

    public Pokemon createPokemon() {
        System.out.println("Enter the Pokemon name:");
        String name = scanner.nextLine();

        System.out.println("Enter the Pokemon hit points:");
        int hitPoints = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter the Pokemon move:");
        String move = scanner.nextLine();

        System.out.println("Enter the Pokemon move power:");
        int movePower = scanner.nextInt();

        System.out.println("Enter the Pokemon attack speed:");
        int attackSpeed = scanner.nextInt();

        return new Pokemon(name, hitPoints, move, movePower, attackSpeed);
    }

    public void closeScanner() {
        scanner.close();
    }

    public void assignPokemon(int playerNumber) {
        System.out.printf("Player %d: Select a Pokemon and enter its stats\n", playerNumber);
        Pokemon pokemon = createPokemon();
        System.out.printf("Player %d Pokemon: %s\n", playerNumber, pokemon.displayPokemonStats());
    }
}

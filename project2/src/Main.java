public class Main {
    public static void main(String[] args) {
        PokemonSelection pokemonSelection = new PokemonSelection();

        pokemonSelection.assignPokemon(1);
        pokemonSelection.assignPokemon(2);

        pokemonSelection.closeScanner();
    }
}

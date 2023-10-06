import java.util.List;

public class PokemonGymOwner {

    private final List<Pokemon> pokemons;
    public String town;
    public String name;

    public PokemonGymOwner(String name, String town, List<Pokemon> pokemons) {
        this.pokemons = pokemons;
        this.name = name;
        this.town = town;

    }

    public String getTown() {
        return town;
    }

    public String getName() {
        return name;
    }

    public Pokemon[] getPokemons() {
        return getPokemons();
    }
}

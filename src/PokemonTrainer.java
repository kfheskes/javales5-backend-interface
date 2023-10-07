import java.util.List;

public class PokemonTrainer {


        private final String name;
        private final List<Pokemon> pokemons;
    public PokemonTrainer( String name, List<Pokemon> pokemons){
            this.pokemons = pokemons;
            this.name = name;
    }


    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public String getName() {
        return name;
    }
}

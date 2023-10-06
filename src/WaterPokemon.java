import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    private static final String type = "water";

    private final List<String> attacks = Arrays.asList("Surf", "HydroPump", "RainDance", "HydroCanon");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    List<String> getAttacks() {
        return attacks;
    }

    public void surf(Pokemon name, Pokemon enemy) {
    }

    public void hydroPump(Pokemon name, Pokemon enemy) {
    }

    public void hydroCanon(Pokemon name, Pokemon enemy) {
    }

    public void rainDance(Pokemon name, Pokemon enemy) {
    }
}

import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{

    private final List<String> attacks = Arrays.asList("Inferno", "PyroBall", "FireLash", "FlameThrower");
    private static final String type = "fire";
    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }
    List<String> getAttacks() {
        return attacks;
    }

    public void inferno(Pokemon name, Pokemon enemy) {
    }

    public void pyroBall(Pokemon name, Pokemon enemy) {
    }

    public void fireLash(Pokemon name, Pokemon enemy) {
    }

    public void flameThrower(Pokemon name, Pokemon enemy) {
    }


}

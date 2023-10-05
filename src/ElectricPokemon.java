import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

   private final String type = "electric";

    private final List<String> attacks = Arrays.asList("ThunderPunch", "ElectroBall","VoltAttack", "Thunder" );


    public ElectricPokemon(String name, int level, int hp, String food, String sound, String type) {
        super(name, level, hp, food, sound, type);
    }

    public void ThunderPunch(Pokemon name, Pokemon enemy){
        System.out.println(getName() + " attacks " + getEnemy() + " with ThunderPunch");
        if(getName())

    }

    List<String> getAttacks() {
        return attacks;
    }
}

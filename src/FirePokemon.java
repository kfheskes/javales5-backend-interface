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
    public void getFood (Pokemon name){
        System.out.println(name.getName() + "gets food ");
        name.setHp(name.getHp() + 15);
        System.out.println(getName() + " gets 15 hp");
    }

    public void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks" + enemy.getName() + " with a Inferno");

        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 55 hp");
                enemy.setHp(enemy.getHp() - 55);
            } case "water" -> {
                System.out.println(enemy.getName() + " loses 45 hp");
                enemy.setHp(enemy.getHp() -45);
            } case "electric" -> {
                System.out.println(enemy.getName() + " gets 25 hp" );
                enemy.setHp(enemy.getHp() - 25);
            } case "fire" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            } default -> System.out.println("Onbekende type vijand: " + getType());
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }


    public void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks" + enemy.getName() + " with a PyroBall");

        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 45 hp");
                enemy.setHp(enemy.getHp() - 45);
            } case "water" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() -35);
            } case "electric" -> {
                System.out.println(enemy.getName() + " gets 25 hp" );
                enemy.setHp(enemy.getHp() - 25);
            } case "fire" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            } default -> System.out.println("Onbekende type vijand: " + getType());
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }


    public void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks" + enemy.getName() + " with a FireLash");

        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
            } case "water" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() -30);
            } case "electric" -> {
                System.out.println(enemy.getName() + " gets 25 hp" );
                enemy.setHp(enemy.getHp() - 25);
            } case "fire" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            } default -> System.out.println("Onbekende type vijand: " + getType());
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }


    public void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks" + enemy.getName() + " with a FlameThrower");

        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
            } case "water" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() -30);
            } case "electric" -> {
                System.out.println(enemy.getName() + " gets 25 hp" );
                enemy.setHp(enemy.getHp() - 25);
            } case "fire" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            } default -> System.out.println("Onbekende type vijand: " + getType());
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }


}

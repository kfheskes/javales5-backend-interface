import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{

    private static final String type = "grass";

    private final List<String> attacks = Arrays.asList("LeafStorm", "SolarBeam", "LeechSeed", "LeaveBlade");

    public GrassPokemon(String name, int level, int hp, String food, String sound ) {
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

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks" + enemy.getName() + " with a LeafStorm");

        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            } case "fire" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            } case "water" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            } case "grass" -> {
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            } default -> System.out.println("Onbekende type vijand: " + getType());
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks" + enemy.getName() + " with a SolarBeam");

        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
            } case "fire" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            } case "water" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            } case "grass" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            } default -> System.out.println("Onbekende type vijand: " + getType());
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks" + enemy.getName() + " with a LeechSeed");

        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 25 hp" + name.getName() +"gets 25 hp");
                enemy.setHp(enemy.getHp() - 25);
                name.setHp(name.getHp() + 25);
            } case "fire" -> {
                System.out.println(enemy.getName() + " loses 20 hp" + name.getName() +"gets 20 hp");
                enemy.setHp(enemy.getHp() - 20);
                name.setHp(name.getHp() + 20);
            } case "water" -> {
                System.out.println(enemy.getName() + " loses 15 hp" + name.getName() +"gets 15 hp");
                enemy.setHp(enemy.getHp() - 15);
                name.setHp(name.getHp() + 15);
            } case "grass" -> {
                System.out.println(enemy.getName() + " loses 10 hp" + name.getName() +"gets 10 hp");
                enemy.setHp(enemy.getHp() - 10);
                name.setHp(name.getHp() + 10);
            } default -> System.out.println("Onbekende type vijand: " + getType());
        }
        System.out.println(name.getName() + " has " + name.getHp() + " hp left.");
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks" + enemy.getName() + " with a LeaveBlade");

        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            } case "fire" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            } case "water" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            } case "grass" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            } default -> System.out.println("Onbekende type vijand: " + getType());
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }

    }


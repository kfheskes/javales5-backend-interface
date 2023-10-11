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

    public void getFood (Pokemon name){
        System.out.println(name.getName() + "gets food ");
        name.setHp(name.getHp() + 15);
        System.out.println(getName() + " gets 15 hp");
    }
    public void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks" + enemy.getName() + " with a Surf");

        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 45 hp");
                enemy.setHp(enemy.getHp() - 45);
            } case "electric" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            } case "grass" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            } case "water" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            } default -> System.out.println("Onbekende type vijand: " + getType());
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }


    public void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks" + enemy.getName() + " with a HydroPump");

        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 35);
            } case "electric" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            } case "grass" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            } case "water" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 20);
            } default -> System.out.println("Onbekende type vijand: " + getType());
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }


    public void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks" + enemy.getName() + " with a HydroCanon");

        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            } case "electric" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            } case "grass" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            } case "water" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            } default -> System.out.println("Onbekende type vijand: " + getType());
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }


    public void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks" + enemy.getName() + " with a RainDance");

        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
            } case "electric" -> {
                System.out.println( " has no effect on" + enemy.getName());
                enemy.setHp(enemy.getHp());
            } case "grass" -> {
                System.out.println(enemy.getName() + " gets 25 hp" );
                enemy.setHp(enemy.getHp() + 25);
            } case "water" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            } default -> System.out.println("Onbekende type vijand: " + getType());
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }
    }


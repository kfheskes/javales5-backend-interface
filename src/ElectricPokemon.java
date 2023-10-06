import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

   private static final String type = "electric";

    private final List<String> attacks = Arrays.asList("ThunderPunch", "ElectroBall","VoltAttack", "Thunder" );

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    List<String> getAttacks() {
        return attacks;
    }

    public void thunderPunch(Pokemon name, Pokemon enemy){
     System.out.println(name.getName() + " attacks" + enemy.getName() + " with a ThunderPunch");

     switch (enemy.getType()) {
      case "water" -> {
       System.out.println(enemy.getName() + " loses 20 hp");
       enemy.setHp(enemy.getHp() - 20);
      } case "grass" -> {
       System.out.println(enemy.getName() + " loses 15 hp");
       enemy.setHp(enemy.getHp() - 15);
      } case "fire" -> {
       System.out.println(enemy.getName() + " loses 10 hp");
       enemy.setHp(enemy.getHp() - 10);
      } case "electric" -> {
       System.out.println(enemy.getName() + " loses 5 hp");
       enemy.setHp(enemy.getHp() - 5);
      } default -> System.out.println("Onbekende type vijand: " + getType());
     }
     System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }

    public void electroBall(Pokemon name, Pokemon enemy) {
     System.out.println(name.getName() + " attacks" + enemy.getName() + " with a EletroBall");

     switch (enemy.getType()) {
      case "water" -> {
       System.out.println(enemy.getName() + " loses 25 hp");
       enemy.setHp(enemy.getHp() - 25);
      } case "grass" -> {
       System.out.println(enemy.getName() + " loses 20 hp");
       enemy.setHp(enemy.getHp() - 20);
      } case "fire" -> {
       System.out.println(enemy.getName() + " loses 15 hp");
       enemy.setHp(enemy.getHp() - 15);
      } case "electric" -> {
       System.out.println(enemy.getName() + " loses 10 hp");
       enemy.setHp(enemy.getHp() - 10);
      } default -> System.out.println("Onbekende type vijand: " + getType());
     }
     System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }

    public void thunder(Pokemon name, Pokemon enemy) {
     System.out.println(name.getName() + " attacks" + enemy.getName() + " with a Thunder");

     switch (enemy.getType()) {
      case "water" -> {
       System.out.println(enemy.getName() + " loses 25 hp");
       enemy.setHp(enemy.getHp() - 25);
      } case "grass" -> {
       System.out.println(enemy.getName() + " loses 20 hp");
       enemy.setHp(enemy.getHp() - 20);
      } case "fire" -> {
       System.out.println(enemy.getName() + " loses 15 hp");
       enemy.setHp(enemy.getHp() - 15);
      } case "electric" -> {
       System.out.println(enemy.getName() + " gets 20 hp");
       enemy.setHp(enemy.getHp() + 20);
      } default -> System.out.println("Onbekende type vijand: " + getType());
     }
     System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }

    public void voltTackle(Pokemon name, Pokemon enemy) {
     System.out.println(name.getName() + " attacks" + enemy.getName() + " with a VoltTackele");

     switch (enemy.getType()) {
      case "water" -> {
       System.out.println(enemy.getName() + " loses 35 hp");
       enemy.setHp(enemy.getHp() - 35);
      } case "grass" -> {
       System.out.println(enemy.getName() + " loses 30 hp");
       enemy.setHp(enemy.getHp() - 30);
      } case "fire" -> {
       System.out.println(enemy.getName() + " loses 25 hp");
       enemy.setHp(enemy.getHp() - 25);
      } case "electric" -> {
       System.out.println(enemy.getName() + " loses 20 hp");
       enemy.setHp(enemy.getHp() - 20);
      } default -> System.out.println("Onbekende type vijand: " + getType());
     }
     System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }
}

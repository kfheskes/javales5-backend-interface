public abstract class Pokemon {

    private final String name;
    private final int level;
    private int hp;
    private final String food;
    private final String sound;
    private final String type;


    public Pokemon(String name, int level, int hp, String food, String sound, String type ){
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
        this.type = type;
    }
    
    public void throwFood(String foodType) {
        if (foodType.equals(type)) {
            System.out.println(getName() + " received a boost by eating " + getFood());
            setHp(getHp() + 15);
            System.out.println("New HP for " + getName() + " is " + getHp());
        } else {
            System.out.println(getName() + " doesn't like this food!");
        }
    }

    public String getName(){
        return name;
    }
    public int getLevel(){
        return level;
    }
    public int getHp(){
        return hp;
    }
    public void setHp(int hp){
        this.hp = hp;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    public String getType() {
        return type;
    }

}

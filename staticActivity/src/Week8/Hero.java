package Week8;

public class Hero
{
    private String name;
    private int health;
    private int strength;
    private static int enemyCount;

    public Hero(String name, int health, int strength)
    {
        this.name = name;
        this.health = health;
        this.strength = strength;
        enemyCount++;
    }
    public static int getHeroCount()
    {
        return enemyCount;
    }
}

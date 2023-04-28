package Week6;

public class Agent {
    private String name;
    private String ability;
    private int damage;
    private int HP;

    private int armor;

    public Agent(){

    }

    public Agent(String agentName){
        this.name = agentName;
    }

    public Agent(String agentName, String ability, int abilityDamage, int HP, int armorPoints){
        this.name = agentName;
        this.ability = ability;
        this.damage = abilityDamage;
        this.HP = HP;
        this.armor = armorPoints;
    }

    public int getHealth(){
        return HP;
    }

    public void setHealth(int newHP){
        HP = newHP;
    }

    public void setHealth(int newHP, int armor){
        HP = newHP + armor;
    }

    public int getArmor(){
        return armor;
    }

    public void setArmor(int armor){
        this.armor = armor;
    }
}

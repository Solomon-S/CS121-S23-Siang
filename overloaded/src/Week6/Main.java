package Week6;

public class Main {
    public static void main(String[] args) {
        Agent agent1 = new Agent();
        Agent agent2 = new Agent("Chamber");
        Agent agent3 = new Agent("Jett", "Bladestorm",150,100,50);

        System.out.printf("Original health: %d\n", agent3.getHealth());
        agent3.setHealth(100);
        System.out.printf("Set health: %d\n", agent3.getHealth());
        agent3.setHealth(100,agent3.getArmor());
        System.out.printf("Set health with armor: %d\n", agent3.getHealth());

    }
}

package Week8;

public class Main {
    public static void main(String[] args) {
        Hero superman = new Hero ("superman", 100,100);
        Hero spiderman = new Hero ("spiderman",100,60);
        System.out.printf("Superman count: %d%n", superman.getHeroCount());
        System.out.printf("Spiderman count: %d%n", spiderman.getHeroCount());
    }
}

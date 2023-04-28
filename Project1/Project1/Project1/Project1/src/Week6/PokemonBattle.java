package Week6;
import java.util.Scanner;

public class PokemonBattle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int playerScore1 = 0;
        int playerScore2 = 0;
        int rnd = 0;

        System.out.println("POKEMON BATTLE");
        System.out.println("Enter an odd number of rounds: ");
        int oddNumber = Integer.parseInt(input.nextLine());

        int i = 1;
        while (i <= oddNumber) {
            System.out.printf("Round %d\n", i);
            System.out.println("--------");
            System.out.println("Player 1: Select a Pokemon and enter its stats");
            System.out.println("Enter name: ");
            String name1 = input.nextLine();
            System.out.println("Enter HP: ");
            int hp1 = Integer.parseInt(input.nextLine());
            System.out.println("Enter move: ");
            String move1 = input.nextLine();
            System.out.println("Enter move's power: ");
            int movePower1 = Integer.parseInt(input.nextLine());
            System.out.println("Enter attack speed: ");
            int attackSpeed1 = Integer.parseInt(input.nextLine());
            System.out.println();
            System.out.println("Player 2: Select a Pokemon and enter its stats");
            System.out.println("Enter name: ");
            String name2 = input.nextLine();
            System.out.println("Enter HP: ");
            int hp2 = Integer.parseInt(input.nextLine());
            System.out.println("Enter move: ");
            String move2 = input.nextLine();
            System.out.println("Enter move's power: ");
            int movePower2 = Integer.parseInt(input.nextLine());
            System.out.println("Enter attack speed: ");
            int attackSpeed2 = Integer.parseInt(input.nextLine());

            if (attackSpeed1 == attackSpeed2) {
                rnd = (int) (Math.random() * 2 + 1);
            }

            if (attackSpeed1 > attackSpeed2 || rnd == 1) {
                while (hp1 > 0 && hp2 > 0) {
                    hp2 -= movePower1;
                    if (hp2 <= 0) {
                        System.out.println("Player 1's " + name1 + " wins this round\n");
                        playerScore1 += 1;
                        break;
                    }
                    hp1 -= movePower2;
                    if (hp1 <= 0) {
                        System.out.println("Player 2's " + name2 + " wins this round\n");
                        playerScore2 += 1;
                        break;
                    }
                }
            } else if (attackSpeed2 > attackSpeed1 || rnd == 2) {
                while (hp1 > 0 && hp2 > 0) {
                    hp1 -= movePower2;
                    if (hp1 <= 0) {
                        System.out.println("Player 2's " + name2 + " wins this round\n");
                        playerScore2 += 1;
                    }
                    hp2 -= movePower1;
                    if (hp2 <= 0) {
                        System.out.println("Player 1's " + name1 + " wins this round\n");
                        playerScore1 += 1;
                        break;
                    }
                }
            }
            System.out.println("Wins");
            System.out.println("----");
            System.out.printf("Player 1: %d\n", playerScore1);
            System.out.printf("Player 2: %d\n\n", playerScore2);

            rnd = 0;
            i++;
        }
        System.out.println("Final Scores");
        System.out.println("--------");
        System.out.printf("Player 1 final score: %d\n", playerScore1);
        System.out.printf("Player 2 final score: %d\n\n", playerScore2);
        if (playerScore1 > playerScore2) {
            System.out.println("Player 1 wins the game!");
        } else {
            System.out.println("Player 2 wins the game!");
        }

    }
}

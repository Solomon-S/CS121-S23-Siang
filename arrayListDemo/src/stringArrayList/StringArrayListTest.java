package stringArrayList;

public class StringArrayListTest {
    public static void main(String[] args) {
        StringArrayList demo = new StringArrayList();

        demo.addName("Bob");
        demo.addName("Pat");
        demo.addName("Jen");

        System.out.printf("Scores contains %d elements.%n", demo.getSizeOfScoreList());
        demo.displayScore1();
        
    }
}

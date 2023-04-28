package stringArrayList;
import java.util.ArrayList;

public class StringArrayList {
    private ArrayList<String> studentName = new ArrayList<>();
    private ArrayList<String> majors = new ArrayList<>();
    private ArrayList<String> professorName = new ArrayList<>();
    private ArrayList<Integer> scores = new ArrayList<>();


    public void addName(String name){
        studentName.add(name);
    }

    public void removeMajor(String major)
    {
        majors.remove(major);
    }

    public int getScore(int index)
    {
        return scores.get(index);
    }

    public int getSizeOfScoreList()
    {
        return scores.size();
    }

    public void displayScore1()
    {
        System.out.printf("Scores:%n");
        for (Object score: scores)
        {
            System.out.printf("%d%n", score);
        }
    }

    public void displayScore2()
    {
        System.out.printf("Scores:%n");
        for (int i = 0; i < scores.size();i++)
        {
            System.out.printf("%d%n", scores.get(i));
        }

    }

}

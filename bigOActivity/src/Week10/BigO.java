package Week10;

public class BigO {

    public void printOnce(String name)
    {
        System.out.println(name);
    }

    public void printNTimes(int n)
    {
        for (int i = 0; i<n;i++)
        {
            System.err.println("I don't know");
        }
    }

    public void printNSquaredTimes(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.err.println("I don't understand");
            }
        }
    }
}

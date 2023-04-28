package inhertitance;

public class UniversityMember
{
    private int id;
    private String name;
    private String major;

    public UniversityMember(int id, String major, String name)
    {
        this.id = id;
        this.name = name;
        this.major = major;
    }

    public int getId()
    {
        return id;
    }

    public void SetId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getMajor()
    {
        return major;
    }

    public void setYearsTaught(String major)
    {
        this.major = major;
    }
}

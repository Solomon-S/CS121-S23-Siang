package inhertitance;

public class Professor extends UniversityMember
{
    private int yearsTaught;

    public Professor(int id, String name, String major, int yearsTaught)
    {
        super(id,name,major);
        this.yearsTaught = yearsTaught;
    }

    public int getYearsTaught()
    {
        return yearsTaught;
    }

    public void setYearsTaught(int yearsTaught)
    {
        this.yearsTaught = yearsTaught;
    }

    @Override
    public String toString()
    {
        return String.format("Name:  %s%nID: %d%nSalary: %.2f%n", getName(), getId(),getMajor(), getYearsTaught());


    }
}


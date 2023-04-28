package inhertitance;

public class Student extends UniversityMember
{
    private double gpa;

    public Student(int id, String name, String major, double gpa)
    {
        super(id,name,major);
        this.gpa = gpa;
    }

    public double getGpa()
    {
        return gpa;
    }

    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }

    @Override
    public String toString()
    {
        return String.format("Name:  %s%nID: %d%nSalary: %.2f%n", getName(), getId(),getMajor(), getGpa());


    }
}

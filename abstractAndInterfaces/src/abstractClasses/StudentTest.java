package abstractClasses;

public class StudentTest extends Student
{

    public StudentTest(int id, String name) {
        super(id, name);
    }

    @Override
    public int getGrade() {
        return 0;
    }
}

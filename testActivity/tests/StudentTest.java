import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    private Student student = new Student("Solomon", 1234);

    @Test
    public void getName() {
        assertEquals("Solomon", student.getName());
    }

    @Test
    public void getID() {
        assertEquals(1234, student.getID());
    }
}
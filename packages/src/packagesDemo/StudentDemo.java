package packagesDemo;

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Solomon","CS" , 65,150);

        System.out.printf("Name: %s%n", student1.name);
        System.out.printf("Major: %s%n", student1.major);
        //System.out.printf("Height: %s%n", height);
        //System.out.printf("Weight: %s%n", weight);

        student1.getStudentInfo();
        System.out.println();
        //student1.getStudentHeight();
        student1.getStudent();
        System.out.println();
        student1.getStudentWeight();

    }
}

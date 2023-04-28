public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Doe", "1001", "Computer Science", "Freshman");
        student1.addCourse("Programming Fundamentals");
        student1.addCourse("Discrete Structures");
        student1.addCourse("Calculus");
        student1.addCourse("English Composition");
        System.out.println(student1.getStudentInfo());
        student1.displayStudentCourses();
        student1.removeCourse("English Composition");
        System.out.println("After removing one course:");
        student1.displayStudentCourses();

        Student student2 = new Student("Jane", "Smith", "1002", "Biology", "Sophomore");
        student2.addCourse("General Chemistry");
        student2.addCourse("Organic Chemistry");
        student2.addCourse("Microbiology");
        System.out.println(student2.getStudentInfo());
        student2.displayStudentCourses();
        student2.removeCourse("Organic Chemistry");
        System.out.println("After removing one course:");
        student2.displayStudentCourses();
    }
}

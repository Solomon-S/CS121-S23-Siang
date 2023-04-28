package packagesDemo;

public class Student {
    public String name;
    private int height;
    private int weight;
    public String major;

    public Student(String name, String major, int height, int weight){
        this.name = name;
        this.major = major;
        this.height = height;
        this.weight = weight;
    }

    public void getStudentInfo(){
        System.out.printf("Name: %s%nMajor: %s%n", name, major);
    }

    private void getStudentHeight(){
        System.out.printf("Name: %s%nHeight: %s%n", name, height);
    }
    protected void getStudentWeight(){
        System.out.printf("Name: %s%nWeight: %s%n", name, weight);
    }

    void getStudent(){
        System.out.printf("Name: %s%n", name);
    }


}

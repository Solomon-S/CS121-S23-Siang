package Week6;

public class Triangle {
    int height;
    int base;
    int area;

    public Triangle(int h, int b){
        this.height = h;
        this.base = b;
    }

    void calculateArea(){
        area = (base*height)/2;
    }

    void printArea(){
        System.out.printf("The area of the triangle is %d", area);
    }
}

package Class;

class Rectangle {
    // instance method with parameters
    int area(int length, int breadth){
        return length * breadth;
    }
}
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        int result = r1.area(10, 5); // passing arguments
        System.out.println("Area: " + result);
    }
}

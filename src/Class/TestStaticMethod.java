package Class;

class functions_2 {
    // static method
    static int square(int num){
        return num * num;

    }
}
public class TestStaticMethod{
    public static void main(String[] args) {
        int result = functions_2.square(5);
        System.out.println("square of 5 = " + result);
    }
}

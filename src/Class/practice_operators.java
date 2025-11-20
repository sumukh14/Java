package Class;
import java.util.Scanner;

public class practice_operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int divide = a/b;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(divide);
    }
}


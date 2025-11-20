package Class;
import java.util.*;
public class charity {
    public static void main(String[] args) {
        int a = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            a = a+i*i;
        }
        System.out.println(a);

    }
}

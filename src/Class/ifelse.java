

package Class;
import java.util.*;

public class ifelse {
    public static void main(String[] args) {
//        int i = 20;
//        if(i == 10)
//            System.out.println("i is 10");
//        else if (i ==15)
//            System.out.println("i is 15");
//        else if (i ==20)
//            System.out.println("is is 20");
//        else
//            System.out.println("i is not present");

        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();
        if(temp>0){
            System.out.println("safe for outdoor activities");

        }else{
            System.out.println("too cold for outside activities");
        }
    }
}

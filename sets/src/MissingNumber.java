import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class MissingNumber {
    public static void main(String[] args){
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5,7,10));
        HashSet<Integer> set2 = new HashSet<>();
        for(int i=1 ; i<=10; i++){
            set2.add(i);
        }

        System.out.print("Original Set is : ");
        System.out.println(set1);

        set2.removeAll(set1);
        System.out.println("Missing Number Is : "  + set2);


    }
}
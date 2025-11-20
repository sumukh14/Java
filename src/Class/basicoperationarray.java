package Class;
import java.util.*;
public class basicoperationarray {
    public static void main(String[] args) {
        int[] numbers = new int [5];
        // 1.insert
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        // 2.access
        System.out.println("access index 2: " + numbers[2]);

        // 3. update
        numbers[2] = 99;
        System.out.println("updated index 2: " + numbers[2]);

        // 4. traverse
        System.out.println("traversing id array: ");
        for(int i = 0; i< numbers.length; i++){
            System.out.println("element at index " + i +": " + numbers[i]);
        }

        // 5.length
        System.out.println("length of id array: " + numbers.length);
    }
}

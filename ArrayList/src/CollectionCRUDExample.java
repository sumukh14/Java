import java.util.*;

public class CollectionCRUDExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        // add element
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        System.out.println(fruits);
        // access element
        System.out.println("Element at index 1: "+fruits.get(1));
        // modify element
        fruits.set(1,"Pineapple");
        // insert element
        fruits.add(2,"Grapes");
        // remove element
        fruits.remove("Orange");
        System.out.println("After insertion and removal: "+fruits);
        // check if element available
        System.out.println("Contains Mango? "+ fruits.contains("Mango"));
        // get size
        System.out.println("Size of the first:"+ fruits.size());
        // sort array list
        Collections.sort(fruits);
        System.out.println("Sorted list: "+ fruits);
        // iterate in arraylist -1
        System.out.println("Iterating using for each loop: ");
        for(String str: fruits){
            System.out.println(str);
        }
        // iterate in arraylist-2(using iterator/ iterator method)
        System.out.println("Iterating using iterator: ");

    }
}

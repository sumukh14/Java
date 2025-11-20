package Class;

public class string_3 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        int l1 = s1.length();
        int l2 = s2.length();
        System.out.println(l1+l2);

        // lexicographically compare
        if(s1.compareTo(s2) < 0){
            System.out.println("yes");
        }else{
            System.out.println("mo");
        }

        // capitalise
        String caps1 = s1.substring(0,1).toUpperCase()+s1.substring(1);
        String caps2 = s2.substring(0,1).toUpperCase()+s2.substring(1);
        System.out.println(caps1+ " "+caps2);
    }
}

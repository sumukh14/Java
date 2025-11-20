import java.util.*;

public class sets_1 {
    public static void main(String[] args) {
        String[] emails = {
                "a@gmail.com", "b@yahoo.com", "c@gmail.com", "d@outlook.com"
        };
        Set<String> domains = new HashSet<>();
        for(String email : emails){
            String domain = email.substring(email.indexOf('@') +1);
            domains.add(domain);
        }
        System.out.println("Uniques Domain: ");
        for(String d : domains){
            System.out.println("- "+ d);
        }
    }
}

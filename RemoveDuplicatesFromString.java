//Assignment-4,sollution-1
//wap to remove the duplicates from a String
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {
    
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Original string: " + str);
        
        String result = removeDuplicates(str);
        System.out.println("String after removing duplicates: " + result);
    }
    
    public static String removeDuplicates(String str) {
        // Create a LinkedHashSet to maintain the order of characters
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        
        // Traverse the string and add each character to the set
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        
        // Construct the resulting string by joining the characters from the set
        StringBuilder sb = new StringBuilder();
        for (Character ch : set) {
            sb.append(ch);
        }
        
        return sb.toString();
    }
}


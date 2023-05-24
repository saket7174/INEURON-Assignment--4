//Assignment-4,sollution-2
//wap to remove the duplicates from a String
import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateFromString {
    
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Original string: " + str);
        
        System.out.println("Duplicate characters:");
        printDuplicateCharacters(str);
    }
    
    public static void printDuplicateCharacters(String str) {
        // Convert the string to lowercase to treat uppercase and lowercase characters as equal
        str = str.toLowerCase();
        
        // Create a map to store character frequency
        Map<Character, Integer> charMap = new HashMap<>();
        
        // Traverse the string and count the frequency of each character
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
            }
        }
        
        // Print the characters with frequency greater than 1
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}


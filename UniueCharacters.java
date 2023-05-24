//Assignment-4,sollution-7
//wap to find if String contains all unique Characters
public class UniueCharacters {
    
    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println("String: " + str);
        
        boolean hasUniqueCharacters = checkUniqueCharacters(str);
        
        if (hasUniqueCharacters) {
            System.out.println("The string contains all unique characters.");
        } else {
            System.out.println("The string does not contain all unique characters.");
        }
    }
    
    public static boolean checkUniqueCharacters(String str) {
        // Create an array to track the occurrence of each character
        boolean[] charSet = new boolean[256];
        
        // Traverse the string and mark the occurrence of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if the character has already occurred
            if (charSet[ch]) {
                return false; // Not all characters are unique
            }
            
            charSet[ch] = true;
        }
        
        return true; // All characters are unique
    }
}

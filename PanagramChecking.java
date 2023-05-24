//Assignment-4,sollution-6
//wap to implement panagram checking with least inbuilt methods being used
public class PanagramChecking {
    
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        
        System.out.println("Sentence: " + sentence);
        
        boolean isPangram = checkPangram(sentence);
        
        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }
    
    public static boolean checkPangram(String sentence) {
        // Convert the sentence to lowercase
        sentence = sentence.toLowerCase();
        
        // Create a boolean array to track the presence of each letter
        boolean[] letterPresent = new boolean[26];
        
        // Traverse the sentence and mark the presence of each letter
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                letterPresent[index] = true;
            }
        }
        
        // Check if all letters are present
        for (boolean present : letterPresent) {
            if (!present) {
                return false;
            }
        }
        
        return true;
    }
}


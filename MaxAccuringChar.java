//Assignment-4,sollution-8
//wap to find Maximum Accuring character in the string
public class  MaxAccuringChar  {
     public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("String: " + str);
        
        char maxOccurringChar = findMaxOccurringChar(str);
        
        System.out.println("Maximum occurring character: " + maxOccurringChar);
    }
    
    public static char findMaxOccurringChar(String str) {
        // Create an array to track the frequency of each character
        int[] charCount = new int[256];
        
        // Traverse the string and count the occurrence of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charCount[ch]++;
        }
        
        // Find the character with the maximum occurrence
        char maxChar = ' ';
        int maxCount = 0;
        
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > maxCount) {
                maxChar = (char) i;
                maxCount = charCount[i];
            }
        }
        
        return maxChar;
    }
}


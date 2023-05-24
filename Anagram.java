//Assignment-4,sollution-5
//wap to implement Anagram checking least inbuilt method being used
public class Anagram{
     public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        
        boolean isAnagram = checkAnagram(str1, str2);
        
        if (isAnagram) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
    
    public static boolean checkAnagram(String str1, String str2) {
        // Convert the strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        // Check if the lengths of the strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Create an array to store the count of each character
        int[] charCount = new int[26];
        
        // Traverse the first string and increment the count for each character
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            charCount[ch - 'a']++;
        }
        
        // Traverse the second string and decrement the count for each character
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            charCount[ch - 'a']--;
        }
        
        // Check if all counts are zero
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    }
}


//Assignment-4,sollution-4
//wap to count Constent, Vowels, Special Character in the given String "Aa*7744#@BR"
public class Count {
     public static void main(String[] args) {
        String str = "Aa*7744#@BR";
        System.out.println("String: " + str);
        
        int consonantCount = countConsonants(str);
        int vowelCount = countVowels(str);
        int specialCharCount = countSpecialCharacters(str);
        
        System.out.println("Consonants: " + consonantCount);
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Special Characters: " + specialCharCount);
    }
    
    public static int countConsonants(String str) {
        str = str.toLowerCase();
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch >= 'a' && ch <= 'z' && isConsonant(ch)) {
                count++;
            }
        }
        
        return count;
    }
    
    public static boolean isConsonant(char ch) {
        return !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
    
    public static int countVowels(String str) {
        str = str.toLowerCase();
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch >= 'a' && ch <= 'z' && isVowel(ch)) {
                count++;
            }
        }
        
        return count;
    }
    
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    
    public static int countSpecialCharacters(String str) {
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (!Character.isLetterOrDigit(ch)) {
                count++;
            }
        }
        
        return count;
    }
}

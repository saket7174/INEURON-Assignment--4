//Assignment-4,sollution-3
//wap to check weather "2552" is palindrome or not
public class  CheckPalindrome{
    
    public static void main(String[] args) {
        int number = 2552;
        System.out.println("Number: " + number);
        
        boolean isPalindrome = checkPalindrome(number);
        if (isPalindrome) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
    
    public static boolean checkPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        
        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        
        return originalNumber == reversedNumber;
    }
}


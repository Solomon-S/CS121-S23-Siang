public class PalindromeDemo extends PalindromeDetector {
    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "hello";

        System.out.println(str1 + " is a palindrome? " + isPalindrome(str1));
        System.out.println(str2 + " is a palindrome? " + isPalindrome(str2));
    }
}

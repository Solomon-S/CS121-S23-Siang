public class PalindromeDetector {
    public static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0 || str.length() == 1) {
            return true;
        } else if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        } else {
            return false;
        }
    }

}

//The time complexity is pretty fast
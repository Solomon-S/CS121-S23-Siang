public class BalancedBracketsTester {

    public static void main(String[] args) {
        String str1 = "{[()]}";
        String str2 = "{[(])}";
        String str3 = "{{[[(())]]}}";

        System.out.println(str1 + " is balanced: " + BalancedBrackets.isBalanced(str1));
        System.out.println(str2 + " is balanced: " + BalancedBrackets.isBalanced(str2));
        System.out.println(str3 + " is balanced: " + BalancedBrackets.isBalanced(str3));
    }
}

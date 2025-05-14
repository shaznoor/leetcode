package LeetCode;

public class ValidPalindrome125 {
    public static boolean isPalindrome(String s) {
        String ans = "";
        String str = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (str.charAt(i) - 'a' >= 0 && str.charAt(i) - 'a' < 26) {
                ans += str.charAt(i);
            }
        }

        int start = 0, end = ans.length() - 1;
        while (start <= end) {
            if (ans.charAt(start) == ans.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
}

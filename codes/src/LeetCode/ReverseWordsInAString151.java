package LeetCode;

public class ReverseWordsInAString151 {
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder(words[words.length - 1]);
        for (int i = words.length - 2; i >= 0; i--) {
            ans.append(" ").append(words[i]);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String ans = "  hello world  ";
        System.out.println(reverseWords(ans));
    }
}

package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class WordPattern290 {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;}

        HashMap<Character, String> charToWord = new HashMap<>();
        HashSet<String> seenWords = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(w)) {
                    return false;}
            } else {
                if (seenWords.contains(w)) {
                    return false;}
                charToWord.put(c, w);
                seenWords.add(w);}}
        return true;
    }
    public static void main(String[] args) {
        String pattern = "aaaa";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
}

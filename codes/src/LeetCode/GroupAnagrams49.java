package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groups = new HashMap<>();

        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            groups.computeIfAbsent(sortedStr, k->new ArrayList<>()).add(str);
        }

        return new ArrayList<>(groups.values());
    }
    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = groupAnagrams(str);
        System.out.println(ans);
    }
}

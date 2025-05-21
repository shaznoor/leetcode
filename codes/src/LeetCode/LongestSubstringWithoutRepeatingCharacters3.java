package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters3 {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        HashSet<Character> charSet = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }

            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;

        /*The last position where each character was seen
        HashMap<Character, Integer> map = new HashMap<>();
        int l=0;
        int r=0;
        int maxlen=0;
        int n=s.length();

        while(r<n){
            char c = s.charAt(r);
            if(map.containsKey(c) && map.get(c)>=l){
                l=map.get(c)+1;
            }
            maxlen = Math.max(maxlen, r-l+1);
            map.put(c, r);
            r++;
        }
        return maxlen;*/

        /*Brute Force Method
        int n = s.length();
        int[] arr = new int[128];
        int maxlen = 0;

        for(int i=0;i<n;i++){
            Arrays.fill(arr,-1);
            for(int j=i;j<n;j++){
                if(arr[s.charAt(j)]==1){
                    break;
                }
                arr[s.charAt(j)]=1;
                maxlen = Math.max(maxlen, j-i+1);
            }
        }
        return maxlen;*/
    }
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}

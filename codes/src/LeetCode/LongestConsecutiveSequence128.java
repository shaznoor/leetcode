package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence128 {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> arr = new HashSet<>();
        for (int x : nums) {
            arr.add(x);
        }

        int longest = 0;
        for (int num : arr) {
            if (!arr.contains(num - 1)) {
                int length = 1;
                while (arr.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }
}

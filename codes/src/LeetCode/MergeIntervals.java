package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static List<int[]> merge(int[][] intervals) {
        int n = intervals.length;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();

        // Checking for all possible overlaps
        for (int i = 0; i < n; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            // Skipping already merged intervals
            if (!res.isEmpty() && res.get(res.size() - 1)[1] >= end) {
                continue;
            }

            // Find the end of the merged range
            for (int j = i + 1; j < n; j++) {
                if (intervals[j][0] <= end) {
                    end = Math.max(end, intervals[j][1]);
                }
            }
            res.add(new int[]{start, end});
        }
        return res;

    }
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        List<int[]> res = merge(intervals);
        for(int[] x : res){
            System.out.println(x[0]+" "+x[1]);
        }
    }
}

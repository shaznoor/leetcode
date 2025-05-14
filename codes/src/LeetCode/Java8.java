package LeetCode;

import java.util.Arrays;

public class Java8 {
    public static int[] sortArray(int[] num){
        return Arrays.stream(num).sorted().toArray();
    }
    public static void main(String[] args) {
        int[] num = {2,1,4,6,5,3};
        System.out.println(Arrays.toString(sortArray(num)));
    }
}

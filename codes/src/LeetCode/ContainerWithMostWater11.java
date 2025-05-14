package LeetCode;

public class ContainerWithMostWater11 {
    public static int maxArea(int[] height) {
        int maxA = 0;
        int l = 0;
        int r = height.length-1;

        while(l<r){
            int area = (r-l)*Math.min(height[l], height[r]);
            maxA = Math.max(maxA, area);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxA;
    }
    public static void main(String[] args) {
        int[] nums={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
    }
}

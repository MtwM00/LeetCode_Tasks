package Leetcode;

public class Task_11 {

    public static void main(String[] args) {

        int[] height = new int[]{1,8,6,2,5,4,8,3,7};

        Task_11 task_11 = new Task_11();
        System.out.println(task_11.maxArea(height));


    }

    public int maxArea(int[] height) {

        int l = 0;
        int r = height.length - 1;
        int area = 0;
        int maxArea = 0;

        while (l != r) {
            area = Math.min(height[l], height[r]) * (r - l);
            maxArea = Math.max(area, maxArea);
            if (height[l] <= height[r]) {
                l++;
            }
            else {
                r--;
            }
        }
        return maxArea;
    }

}

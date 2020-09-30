package com.company;

import java.util.Arrays;

import static java.lang.System.exit;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
 */
public class RotateArray {

    //Method 1: time-O(n); space-O(n)
//    public void rotate(int[] nums, int k) {
//        if(k > nums.length){
//            k = k - nums.length;
//        }
//        int[] temp = new int[k];
//        for(int i = nums.length - k; i < nums.length; i++){
//            temp[i - (nums.length - k)] = nums[i];//store the last k elements from the nums
//        }
//        for(int i = nums.length - 1 ; i >= k; i--){
//            nums[i] = nums[i-k];//replace the last length-k elements in nums
//        }
//        for(int i = 0; i < k; i++){
//            nums[i] = temp[i];
//        }
//
//    }

    //Method 2: time-O(n); space-O(1)
    public void rotate(int[] nums, int k) {
        if(k >= nums.length){
            k = k - nums.length;
        }
        reverse(nums, 0, nums.length - k - 1 );
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }
    public void reverse(int[] nums, int start, int end){
        if(start == end || start > end){
            return;
        }
        for(int i = 0; i<= (end-start)/2; i++){
            int temp = nums[start+i];
            nums[start+i] = nums[end - i];
            nums[end-i] = temp;
        }
    }
    public static void main(String[] orgs){
        int[] nums = {1,2,3};
        RotateArray test = new RotateArray();
        System.out.println(Arrays.toString(nums));
        test.rotate(nums,2);
        System.out.println(Arrays.toString(nums));
    }

}

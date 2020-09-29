package com.company;

import java.util.Arrays;
//https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3231/
public class thirdMaximumNumber {
    //sort first, not O(n)
//    public int thirdMax(int[] nums) {
//
//        Arrays.sort(nums);
//        int maxCounter = 0;
//        int pointer = nums.length - 1;
//        while(maxCounter<2 && pointer > 0){
//            if(nums[pointer] != nums[pointer-1]){
//                maxCounter++;
//                pointer--;
//            }else{
//                pointer--;
//            }
//        }
//        if(maxCounter<2){
//            return nums[nums.length - 1];
//        }
//        return nums[pointer];
//
//    }

    //O(n) solution from: https://www.youtube.com/watch?v=7hbaFYuJY5Y
    public int thirdMax(int[] nums){
        Integer max = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        for( Integer num : nums){
            if(num.equals(max) || num.equals(secondMax) || num.equals(thirdMax)){
                continue;
            }
            if(max == null || num > max){
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            }else if(secondMax == null || num > secondMax){
                thirdMax = secondMax;
                secondMax = num;
            }else if(thirdMax == null || num > thirdMax){
                thirdMax = num;
            }
        }

        if(thirdMax == null){
            return max;
        }else{
            return thirdMax;
        }


    }

    public static void main(String[] args) {
        thirdMaximumNumber test = new thirdMaximumNumber();
        int[] input = {2, 2, 3, 1};
        System.out.println(test.thirdMax(input));
    }
}

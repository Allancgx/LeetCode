package com.company;

import java.util.Arrays;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
public class ContainsDuplicate {

    //Sort then search
//    public boolean containsDuplicate(int[] nums){
//        Arrays.sort(nums);
//        for(int i = 0; i < nums.length - 1; i++){
//            if(nums[i] == nums[i+1]){
//                return true;
//            }
//        }
//        return false;
//    }

    public boolean containsDuplicate(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            for(int x = i + 1; x < nums.length; x++){
                if(nums[x] == nums[i]){
                    return true;
                }
            }
        }
        return false;
    }

}

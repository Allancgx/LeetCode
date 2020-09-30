package com.company;

/**
 * @author Allan
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
 */
public class RemoveDuplicateFromSortedArray {
    public int removeDuplicates(int[] nums){
        int writerPointer = 1;//Assuming the first element of index 0 is always unique so we start rewriting from index 1
        for(int i = 1; i< nums.length; i++){
            if(nums[i] != nums[i-1]) {
                nums[writerPointer] = nums[i];
                writerPointer++;
            }
        }
        return writerPointer;
    }

    public static void main(String[] args){
        RemoveDuplicateFromSortedArray test = new RemoveDuplicateFromSortedArray();
        int[] input1 = {1,1,2};
        int[] input2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.printf("Answer1: %o, Answer2: %o", test.removeDuplicates(input1), test.removeDuplicates(input2));
    }
}

package com.company;
//https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/
//Max Consecutive Ones
public class Main {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int longest = 0;
        int current = 0;
        for(int each: nums){
            if (each == 1){
                current++;
            }else{
                current = 0;
            }
            if (current > longest){
                longest = current;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] input = {1,1,0,1,1,1};
	System.out.println(findMaxConsecutiveOnes(input));
    }
}

package com.company;

import java.util.*;

public class FindAllNumbersDisappeared {

    //Method 1
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        HashSet<Integer> set = new HashSet();
//        for(Integer num: nums){
//            set.add(num);
//        }
//        List<Integer> output = new ArrayList<Integer>();
//        for(int i = 1; i < nums.length+1; i++){
//            if(!set.contains(i)){
//                output.add(i);
//            }
//        }
//        return output;
//    }

    //Method 2: using ArrayList
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        List<Integer> output = new ArrayList<Integer>();
//        for(int i = 1; i< nums.length+1; i++){
//            output.add(i);
//        }
//        for(int i = 0; i< nums.length; i++){
//            output.set(nums[i]-1, 0);
//        }
//        for(int i = nums.length - 1; i>=0; i--){
//            if(output.get(i) == 0){
//                output.remove(i);
//            }
//        }
//
//        return output;
//    }
    //Method 3: using LinkedList, time out.
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        LinkedList<Integer> output = new LinkedList<Integer>();
//        for(int i = 1; i< nums.length+1; i++){
//            output.add(i);
//        }
//        for(int i = 0; i< nums.length; i++){
//            output.set(nums[i]-1, 0);
//        }
//        for(int i = nums.length - 1; i>=0; i--){
//            if(output.get(i) == 0){
//                output.remove(i);
//            }
//        }
//
//        return output;
//    }
    //Method 4: using https://www.youtube.com/watch?v=jSfDPVIYe1s
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i = 0; i< nums.length; i++){
            int indexToBeMarked = Math.abs(nums[i]);// "-" will be a mark to show that this place is occupied by a number from nums.
            nums[indexToBeMarked-1] = -Math.abs(nums[indexToBeMarked-1]);//If the number is already negative, keep it negative becasue we got duplications.
        }
        List<Integer> output = new ArrayList<Integer>();
        for(int i = 0; i< nums.length; i++){
            if(nums[i] > 0){
                output.add(i+1);
            }
        }
        return output;
    }

    public static void main(String[] args){
        FindAllNumbersDisappeared test = new FindAllNumbersDisappeared();
        int[] input = {4,3,2,7,8,2,3,1};
        System.out.println(test.findDisappearedNumbers(input));
    }
}

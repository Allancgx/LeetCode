package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/


public class SingleNumber {

     /**
     * Method 1: sort and then go through. Slow
     */
//    public int findSingle(int[] input){
//        Arrays.sort(input);
//        for(int i = 0; i < input.length - 1; i = i+2){
//            if(input[i] != input[i+1]){
//                return input[i];
//            }
//        }
//        return input[input.length-1];
//    }

/**
 * Method 2
 */
  public int findSingle(int[] nums){
      HashMap<Integer,Integer> hash_table = new HashMap<>();
      for(int num : nums){
          hash_table.put(num, hash_table.getOrDefault(num,0)+1);
      }
      Set<Integer> keys = hash_table.keySet();
      for(int key : keys){
          if(hash_table.get(key) == 1){
              return key;
          }
      }
      return -1;
    }

    public static void main(String[] args){
        int[] input = {1};
        SingleNumber test = new SingleNumber();
        System.out.println(test.findSingle(input));
    }
}

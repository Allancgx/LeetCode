package com.company;

import java.lang.Math;
import java.util.Arrays;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/
public class PlusOne {

    public int[] plusOne(int[] digits) {
        //Brutal Force Method
        double number = 0;
        //Step 1: loop through the whole list to find the number
        for (int i = digits.length - 1; i >= 0; i--) {
            number += digits[i] * Math.pow(10, digits.length - i - 1);
        }
        //Step 2: Add One
        number++;
        //Step 3: Construct a new array to return
        String str = String.valueOf(number);
        //System.out.println(str);
        int length = str.length();
        int[] newDigits = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            newDigits[i] = (int) (number % 10);
            number = number/10;
        }
        if(length < 13){
            //This part is not behaving correctly
            return Arrays.copyOfRange(newDigits, 2, length);
        }else{
            return Arrays.copyOfRange(newDigits, 3, length);
        }

    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3};
        int[] input2 = {1, 2, 9};
        int[] input3 = {9};
        int[] input4 = {9,8,7,6,5,4,3,2,1,0};

        PlusOne test = new PlusOne();

        System.out.println(Arrays.toString(test.plusOne(input1)));
        System.out.println(Arrays.toString(test.plusOne(input2)));
        System.out.println(Arrays.toString(test.plusOne(input3)));
        System.out.println(Arrays.toString(test.plusOne(input4)));
    }

}

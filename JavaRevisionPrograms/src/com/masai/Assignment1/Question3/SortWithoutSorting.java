package com.masai.Assignment1.Question3;

import java.util.Arrays;

public class SortWithoutSorting {
	public static void sortColors(int[] nums) {
        int ones=0;
        int zeros=0;
        for(int i=0 ;i<nums.length; i++){
            if(nums[i]==0){
                zeros++;
            }
            else if(nums[i]==2){
                ones++;
            }
            
        }
        for(int i=0 ;i<nums.length; i++){
            if(zeros>0){
                nums[i]=0;
                zeros--;
            }
            else if(ones>0){
                nums[i]=1;
                ones--;
            }
            else{
                nums[i]=2;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
	public static void main(String[] args) {
		int arr[]= {0,1,2,0,2,1,3,4};
		sortColors(arr);
	}

}

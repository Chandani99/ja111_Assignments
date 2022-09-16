package revisionContest;

import java.util.ArrayList;
import java.util.List;

public class ProductOfElements {
	 public static int[] productExceptSelf(int[] nums) {
	        int [] arr=new int[nums.length];
	        int [] left=new int[nums.length];
	        int [] right=new int[nums.length];
	        int product=1;
	        left[0]=1;
	        for(int i=1; i<nums.length; i++){
	            product=product*(i-1);
	            left[i]=product;
	        }
	        right[nums.length-1]=1;
	        product=1;
	        for(int i=nums.length-2; i>=0; i--){
	            product=product*(i+1);
	            right[i]=(product);
	        }
	        
	        return null;
	    }
	 
	 public static void main(String []args) {
		 int arr[]= {1,2,3,4};
		 int [] ans=productExceptSelf(arr);
	 }
}

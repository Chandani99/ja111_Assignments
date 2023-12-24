package Sorting;

import java.util.Arrays;
import java.util.Collection;
import java.util.Stack;

public class InsertionSort {
	
	public static int []findNearestGreater(int arr[], int n) {
		int ansArr[]=new int[n];
		Stack<Integer> stk=new Stack<>();
		for(int i=0; i<n; i++) {
			while(stk.size()>0 && stk.peek()<=arr[i]) {
				stk.pop();
			}
			if(stk.size()==0) {
				ansArr[i]=-1;
			}
			else {
				ansArr[i]=stk.peek();
			}
			stk.push(arr[i]);
		}
		return ansArr;
	}
	public static int [] insertionSort(int []arr,int n){
		for(int i=1; i<n; i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && key<=arr[j]) {
				
				arr[j+1]=arr[j];
					
				j--;
			}
			arr[j+1]=key;
		}
		return arr;
	}
	public static void main(String[] args) {
		int [] arr= {12, 31, 25, 8, 32, 17};
		
		
		int n=arr.length;
		System.out.println(Arrays.toString(findNearestGreater(arr,n)));
		System.out.println(Arrays.toString(insertionSort(arr,n)));
		
	}

}

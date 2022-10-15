package DSA_Day1;

public class MaxSumOfTwos {

//	Brut force approach
//	===================================
	static void findMaxBrutForce(int []arr) {
		int maxSum=Integer.MIN_VALUE;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(maxSum<arr[i]+arr[j]) {
					maxSum=arr[i]+arr[j];
				}
			}
		}
		System.out.println(maxSum);
	}
	
//	Linear approach
//	===================================
	static void findMaxLinear(int []arr) {
		int max=arr[0];
		int secMax=arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				secMax=max;
				max=arr[i];
			}
			else if(arr[i]>secMax) {
				secMax=arr[i];
			}
		}
		System.out.println(secMax+max);
	}
	
	public static void main(String[] args) {
		int [] arr= {4, 3, 10, 7,-5, -7, 8, 1, -2};
		findMaxBrutForce(arr);
		findMaxLinear(arr);
		// TODO Auto-generated method stub

	}

}

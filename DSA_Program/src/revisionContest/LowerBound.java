package revisionContest;

import java.util.Scanner;

public class LowerBound {
	public static void lowerBound(int []arr,int size, int k){
        int ans=-1;
        int left=0, right=size-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]>k){
                right=mid-1;
            }
            else if(arr[mid]<k){
                left=mid+1;
            }
            else if(arr[mid]==k){
                ans=mid;
                right=mid-1;
            }
        }
       System.out.println(ans);
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int k=sc.nextInt();
        int [] arr=new int[s];
        for(int i=0; i<s; i++){
            arr[i]=sc.nextInt();
            
        }
        lowerBound(arr,s,k);
    }
}

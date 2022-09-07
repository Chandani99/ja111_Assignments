package revisionContest;

import java.util.Scanner;
import java.util.Stack;

public class SmallerNeighbour {
	 public static void samllerNeighbour(int []arr,int size){
	        int count=0;
	        Stack<Integer> stk=new Stack<>();
	        for(int i=0; i<size; i++ ){
	            while(stk.size()>0 && stk.peek()>=arr[i]){
	                stk.pop();
	            }
	            if(stk.size()==0){
	                System.out.print(-1+" ");
	            }
	            else{
	                System.out.print(stk.peek()+" ");
	            }
	            stk.add(arr[i]);
	        } 
	       System.out.println();
	    }
	    public static void main(String []args){
	        Scanner sc=new Scanner(System.in);
	        int s=sc.nextInt();
	        int [] arr=new int[s];
	        for(int i=0; i<s; i++){
	            arr[i]=sc.nextInt();
	            
	        }
	        samllerNeighbour(arr,s);
	    }
}

package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Max {
	

	    /*
	     * Complete the 'getMax' function below.
	     *
	     * The function is expected to return an INTEGER_ARRAY.
	     * The function accepts STRING_ARRAY operations as parameter.
	     */

	    public static List<Integer> getMax(List<String> operations) {
	    Stack<Integer> stk=new Stack<Integer>();
	    List<Integer>ans =new ArrayList<>();
	        for(String str:operations){
//	        System.out.println(((Object)str.charAt(0)).getClass().getSimpleName());
	            int op=Character.getNumericValue(str.charAt(0));
	            System.out.println(op);
	            if(op==1){
	            	String nStr="";
	            	for(int i=2; i<str.length(); i++) {
	            		nStr+=str.charAt(i);
	            	}
	            	int num=Integer.parseInt(nStr);
//	                int num= Character.getNumericValue(str.charAt(2));
//	                int num3=Character.getNumericValue(str.charAt(3));
	                stk.push(num);
	            }else if(op==2) {

	            	stk.pop();

	            }

	            else if(op==3) {

	            	ans.add(stk.pop());

	            }

	        }
			return ans;

	    }
      public static void main(String args[]) {
    	  List <String> operations=new ArrayList<>();
    	  
    	  operations.add("1 10");
    	  operations.add("2");
    	  operations.add("1 20");
    	  operations.add("2");
    	  operations.add("1 26");
    	  operations.add("1 20");
    	  operations.add("2");
    	  operations.add("3");
    	  operations.add("1 91");
    	  operations.add("3");
    	  
//    	  System.out.println(operations);
    	  List<Integer> result=getMax(operations);
    	  
    	  System.out.println(result);
      }
	
}

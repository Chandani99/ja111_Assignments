package DSA_Day1;

import java.util.ArrayList;
import java.util.List;

public class MinNumber {
	static int min=Integer.MAX_VALUE;
	static List<Integer> mins=new ArrayList<Integer>();
	static List<Integer> list=new ArrayList<>();
	 MinNumber(){

	        // Initialize your data structure here

	    }

	    public void push(int i){
        if(i<min) {
        	min=i;
        	mins.add(min);
        }
        list.add(i);

	    }



	    // Should remove item from top of the stack

	    public void pop(){
           
           list.remove(list.size()-1);
           mins.remove(mins.size()-1);
	    }



	    // Should return the top item from stack without removing it

	    public int top(){
            Integer result=list.get(list.size()-1);
           
	        return result;

	    }



	    // Should return the smallest item from the stack

	    public int min(){

	        return mins.get(mins.size()-1);
	    }





	    public static void main(String[] args) {

	        MinNumber minNumber = new MinNumber();

	        minNumber.push(2);

	        minNumber.push(7);

	        minNumber.push(-1);

	        System.out.println(minNumber.top()); // Should print -1

	        System.out.println(minNumber.min()); // Should print -1

	        minNumber.pop();

	        System.out.println(minNumber.top()); // Should print 7

	        System.out.println(minNumber.min()); // Should print 2

	        minNumber.push(-2);

	        System.out.println(minNumber.min()); // Should print -2

	    }
}

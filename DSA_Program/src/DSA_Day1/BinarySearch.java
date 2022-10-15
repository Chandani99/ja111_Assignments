package DSA_Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

	static int  binarySearch(List<Integer> list) {
		
//		Collections.sort(list);
		
		int left=0;
		int right=list.size()-1;
		int ans=-1;
		while(left<=right){
			int mid=left+(right-left)/2;
			if(list.get(mid)>list.get(right)) {
				ans=list.get(mid);
				left=mid;
			}
			else if(list.get(mid)>list.get(left)) {
				right=mid;
			}
		}
		System.out.println("hello");
		return ans;
		
	}
	public static void main(String[] args) {
	    List<Integer> list=new ArrayList<>();
	    list.add(1);
	    list.add(5);
	    list.add(7);
	    list.add(9); 
	    list.add(6);
	    list.add(3);
	    
	    System.out.println(binarySearch(list));

	}

}

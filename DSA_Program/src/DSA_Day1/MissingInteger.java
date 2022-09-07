package DSA_Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MissingInteger {
	public static void missingInteger(List<Integer> list) {
        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            if(list.get(i)!=i+1){
            	 
              System.out.println(i+1); 
              break;
            }
        }
        
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		int s=sc.nextInt();
		
		List<Integer> list=new ArrayList<>();
		System.out.println("Enter the elements of array");
		for(int i=0; i<s; i++) {
			int num=sc.nextInt();
			list.add(num);
		}
		System.out.println("Missing digit is: ===");
        missingInteger(list);
	}

}

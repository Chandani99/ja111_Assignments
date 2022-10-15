package DSA_Day1;

import java.util.ArrayList;
import java.util.Arrays;

public class BandhooTest {
    
	public static void displayList(String [] arr) {
		String nums[]= {"1","2","3","4","5","6","7","8","9","10"};
		ArrayList<String> list=new ArrayList<>(Arrays.asList(nums));
		System.out.println(list);
		for(int i=0; i<arr.length; i++) {
			String str[]=arr[i].split(" ");
			int sum=0;
			int count=0;
			String name="";
			for(int j=0; j<str.length; j++) {
				if(!list.contains(str[j])) {
					if(!name.equals("")) {
						name+=" "+str[j];
					}
					else {
						name+=str[j];
					}
				}
				else {
					sum+=Integer.parseInt(str[j]);
					count++;
				}
			}
			int avg=sum/count;
			System.out.println(name+"-"+avg);
		}
	}
	public static void main(String[] args) {
		String []arr= {"abc joe 7 8 9","xyz dia 9 5 6"};
		displayList(arr);

	}

}

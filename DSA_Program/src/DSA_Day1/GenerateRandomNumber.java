package DSA_Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateRandomNumber {
 
	static void generateRandom() {
		List<Integer>randoms=new ArrayList<>();;
		Random rand=new Random();
		int i=0;
		while(i<5) {
			int num=rand.nextInt(100);
			if(!randoms.contains(num)) {
				randoms.add(num);
				i++;
			}
		}
		System.out.println(randoms);
	}
	public static void main(String[] args) {
		generateRandom();

	}

}

package DSA_Day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,4,5,7,8,7);
		List<Integer> finalList=list.stream().filter(e->e%2==0).collect(Collectors.toList());

	}

}

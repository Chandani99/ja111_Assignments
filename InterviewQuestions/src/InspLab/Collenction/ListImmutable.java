package InspLab.Collenction;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListImmutable {
	public static void main(String[] args) {
		List<Integer> list = Collections.unmodifiableList(Arrays.asList(1, 3, 2, 5, 6));
//		List<String>
//		list.add(9);
		Iterator<Integer> itr = list.iterator();
		list.set(0, 10);
		System.out.println(list);
	}

//	for()

}

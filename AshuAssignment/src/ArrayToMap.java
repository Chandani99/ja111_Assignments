import java.util.*;
public class ArrayToMap {

	public static void main(String[] args) {
		int [] arr = {1,2,2,4,4,5,6,7,7,7};
		Map<Integer, Integer> map = new HashMap<>();
        for(int i =0 ; i<arr.length; i++) {
        	if(map.containsKey(arr[i])) {
        		map.put(arr[i], map.get(arr[i])+1);
        	}else {
        		map.put(arr[i], 1);
        	}
        }
        System.out.println(map);
        System.out.println("============= iterating throw map=============");
        for(Map.Entry<Integer,Integer> m1:map.entrySet()) {
        	System.out.println("key: "+m1.getKey());
        	System.out.println("value: "+m1.getValue());
        }
	}

}

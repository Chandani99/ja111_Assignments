package revisionContest;

import java.util.Comparator;
import java.util.TreeMap;

class Comp implements Comparator<Integer>{
    public int compare(Integer a, Integer b){
        return b-a;
    }
}


public class GreaterFrequency {
	
	public int findSpecialInteger(int[] arr) {
        TreeMap<Integer, Integer> tm=new TreeMap<>(new Comp());
        for(int i=0; i<arr.length; i++){
            tm.put(arr[i], tm.getOrDefault(arr[i],0)+1);
        }
        // System.out.println(tm);
        int max=-1;
        int size=arr.length/4;
        for(Integer i : tm.keySet()){
            if(tm.get(i)>size ){
               return i;
            }
        }
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

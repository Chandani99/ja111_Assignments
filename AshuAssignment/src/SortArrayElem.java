import java.util.Arrays;

public class SortArrayElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr = {3,2,7,12,4,2,1,3,0,3,5,5,4,0};
	      for(int i=0; i<arr.length-1; i++){
	          for(int j=i+1; j<arr.length; j++){
	                if(arr[i]>arr[j]){
	                    int temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j]=temp;
	                }
	          }
	      }
	      System.out.println(Arrays.toString(arr));
	      
	      
	}

}

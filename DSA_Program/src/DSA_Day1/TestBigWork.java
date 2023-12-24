package DSA_Day1;

public class TestBigWork {
    static void secLargest(int arr[]) {
    	int max=arr[0];
		int secMax=arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				secMax=max;
				max=arr[i];
			}
			else if(arr[i]>secMax) {
				secMax=arr[i];
			}
		}
		System.out.println(secMax);
		
//		select max(marks)  from students group by section;
		
    }
	public static void main(String[] args) {
		
        int [] arr= {2,4,6,8,1,9};
        secLargest(arr);
	}

}

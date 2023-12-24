package CollectionProblems;

public class ShowDuplicates {
    public static void sumOfNum(int n) {
    	int sum=0;
    	for(int i=1; i<=n; i++) {
    		sum+=i;
    	}
    	System.out.println(sum);
    }
    
    public static boolean PrimeTime(int num) {
    	int count=0;
    	if(num==1) {
    		return false;
    	}
    	for(int i=1; i<=num; i++) {
    		if(num%i==0) {
    			count++;
    		}
    	}
    	if(count>2) {
    		return false;
    	}
    	return true;
    }
    
	public static void main(String[] args) {
		int n=1000;
		sumOfNum(n);
		boolean result=PrimeTime(110);
        System.out.println(result);
	}

}

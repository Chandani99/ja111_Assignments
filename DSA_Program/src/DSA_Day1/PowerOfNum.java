package DSA_Day1;

public class PowerOfNum {
    public static int cal(int n, int e) {
    	
//    	Binary way------------------------------
    	
//    	int left=1, right=e;
//    	int ans=1;
//    	while(left<right) {
//    		ans*=n*n;
//    		left++;
//    		right--;
//    	}
//    	if(e%2==1) {
//    		ans*=n;
//    	}
//    	return ans;
    	
    	
//    	Recursion way----------------------------
    	if(e==0) {
    		return 1;
    	}
    	else if(n%2==1) {
    		return n*cal(n,e-1);
    	}
    	else if(n%2==0) {
    		return cal(n*n, e/2);
    	}
    	else {
    		return 1/cal(n, -e);
    	}
    }
    
//    Linear way----------------------------------
    
    public static int cal1(int n, int e) {
    	int ans=1;
    	for(int i=1; i<=e; i++) {
    		ans*=n;
    	}
    	return ans;
    }
	public static void main(String[] args) {
		System.out.println(Math.abs(cal(2,31)));
		System.out.println(cal(2,10));
		System.out.println(cal1(2,8));
	}

}

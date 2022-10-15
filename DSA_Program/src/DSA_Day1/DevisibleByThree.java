package DSA_Day1;

public class DevisibleByThree {
    public static String check(int n) {
    	if(n%3!=0) {
    		return "False";
    	}
    	while(n%3==0) {
    		n=n/3;
    	}
    	if(n==1) {
    		return "True";
    	}
    	return "False";
    	
    }
	public static void main(String[] args) {
		System.out.println(check(27));
		System.out.println(check(30));

	}

}

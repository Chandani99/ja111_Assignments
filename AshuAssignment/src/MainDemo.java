
public class MainDemo {

	public static void main(String[] args) {
//		int a = 10,  b=5;
		LemdaDemo ld=(a,b)-> a+b;
        System.out.println(ld.calculate(10, 10));
	}

}

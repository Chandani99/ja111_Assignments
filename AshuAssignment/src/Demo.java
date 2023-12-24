
public class Demo {
//	public static Integer exc(int a, int b) {
//		try {
//			return a/b;
//		}finally {
//			System.out.println("abc");
//		}
//	}
	public static String name="Chandani";
	
	
	public static void main(String[] args) {
//		try {
//			System.out.println(exc(10,0));
//		}catch(Exception ex) {
//			System.out.println("xyz");
//		}
		Demo demo = new Demo();
		Demo demo1 = new Demo();
		Demo demo2 = new Demo();
		demo.name = "vandana";
		demo1.name = "ABC";
		demo2.name = "XYZ";
		System.out.println(demo.name+" "+demo1.name+" "+demo2.name);
		

	}

}

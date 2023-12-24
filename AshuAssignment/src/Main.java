
public class Main {
	public static void main(String args[]) {
		Parrot p =new Parrot();
		Crow c =new Crow();
		Penguin pe=new Penguin();
		System.out.println(pe.type);
		System.out.println(p.type);
		System.out.println(c.type);

	}
    
}
class Bird{
	String type = "Flying";
}
class Parrot extends Bird{
	String color = "Green";
	String flyingHeight = "50feat";
}
class Crow extends Bird{
	String color = "Black";
	String flyingHeight = "60feat";
}
class Penguin extends Bird{
	String color = "Black and white";
	String flyingHeight = "null";
}

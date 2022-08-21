package carBean;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no. of pasengers");
		int numberOfPreson=sc.nextInt();
		
		System.out.println("Enter kilometers");
		int numberOfKms=sc.nextInt();
		
		Ola myOla = new Ola();
		Car myCar = myOla.bookCar(numberOfPreson, numberOfKms);
		int res = myOla.calculateBill(myCar);
		System.out.println("Total: " +res);

	}

}

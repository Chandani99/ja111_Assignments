package Question2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException, IOException {
		Address ad=new Address("Karnataka","Bangalore","560068");
		Student st=new Student(24, "Chandani", ad, "chandni@gmail.com", "4567");
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("serial.txt"));
		oos.writeObject(st);
		
		oos.close();
        System.out.println("done...");
		// TODO Auto-generated method stub

	}

}

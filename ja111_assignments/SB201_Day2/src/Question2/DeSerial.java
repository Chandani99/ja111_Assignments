package Question2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerial {

	public static void main(String[] args) throws Exception{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("serial.txt"));
		Student st=(Student)ois.readObject();
		System.out.println(st);
		ois.close();

	}

}

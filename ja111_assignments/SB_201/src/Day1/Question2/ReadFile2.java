package Day1.Question2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile2 {

	public static void main(String[] args) throws IOException {
		
			File f=new File("d://abc.txt");
			System.out.println(f);
			
			FileReader fr = new FileReader(f);
			int c=fr.read();
			while(c !=-1) {
				System.out.println((char)c);
				c=fr.read();
			}

	}

}

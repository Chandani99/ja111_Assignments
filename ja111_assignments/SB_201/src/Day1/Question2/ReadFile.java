package Day1.Question2;

import java.io.*;

public class ReadFile {

	public static void main(String[] args)  {
		try {
			FileReader fr = new FileReader("d://abc.txt");
			BufferedReader br=new BufferedReader(fr);
			
		    String line=br.readLine();
		    while(line != null) {
		    	System.out.println(line);
		    	line=br.readLine();
		    }
		    br.close();
		    System.out.println("Done");
		}
		catch(IOException e){
			System.out.println("IO exception occured");
		}
		// TODO Auto-generated method stub

	}

}

package Day1.Question2;
import java.io.*;
import java.util.*;
public class CharCount {

	public static void main( String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
	    
        System.out.println("Enter character to be ");
	    char ch=sc.next().charAt(0);
	    
		File f=new File("d://abc.txt");
		FileReader fr= new FileReader(f);
		
	    int c=	fr.read();
	    
	    int count=0;
	    while(c !=-1) {
	    	if(c==ch) {
	    		count++;
	    	}
	    	c=fr.read();
	    }
	    
	    System.out.println("The no of occurance of char : '"+ch+"', in file '"+f+"' is : "+count);

	}

}

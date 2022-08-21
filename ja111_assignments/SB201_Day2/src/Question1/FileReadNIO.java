package Question1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileReadNIO {

	public static void main(String[] args) throws IOException {
		Path p=Paths.get("d://abc.txt");
		List<String> list=Files.readAllLines(p);
		list.forEach(a->{System.out.println(a);}) ;

	}

}

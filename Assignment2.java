import java.io.*;
import java.util.*;

public class Assignment2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useDelimiter("\\n");
		String str=sc.next();
		// converting to lower case
		str=str.toLowerCase();
		System.out.println(str);
		//replace multiple alphabet to single
		str=str.replaceAll("(.)(?=.*\\1)", "");
		System.out.println(str);
		// to count only alphabetical latter
		str=str.replaceAll("[^a-zA-Z]","");
		System.out.println(str);
		if(str.length()==26)
			System.out.println("All alphabetical letter are present");
		else
			System.out.println("Some alphabetical letter are missing");
	}
}
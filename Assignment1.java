import java.io.*;
import java.util.*;

public class Assignment1 {
	public static void main(String[] args) {
		String s;
        Process p;
        try {
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter the regular expression");
		String str=sc.next();
		while(true ){
            p = Runtime.getRuntime().exec("find / -name "+str);
            BufferedReader br = new BufferedReader(
            new InputStreamReader(p.getInputStream()));
           	while ((s = br.readLine()) != null)
           		System.out.println("file: " + s);
            	p.waitFor();
            	System.out.println ("enter next expression or enter ^C for  for exit: " + p.exitValue());
            	p.destroy();
				str=sc.next();
			}
        	} catch (Exception e) {}
	}
}
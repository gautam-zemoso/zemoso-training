import java.util.regex.*;
import java.util.*;
public class Day5{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Entern sentence to check pattern ");
		String str = sc.nextLine();
		String ptr = "^[A-Z].*\\." ;
		Pattern p = Pattern.compile(ptr);
		Matcher m = p.matcher(str);
		if(m.find()){
			System.out.println("It follow the pattern");
		}
		else {
			System.out.println("It doesn't follow the pattern");	
		}
	}
}

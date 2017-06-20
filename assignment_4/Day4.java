

import java.util.*;
class Excp1 extends Exception {}
class Excp2 extends Exception {}
class Excp3 extends NullPointerException {}
class Day4 {
	void fun(char ch) throws Excp1, Excp2, Excp3 {
		if(ch=='b')
			throw new Excp1();
		else if(ch=='a')
			throw new Excp2();
		else if(ch=='c') 
			throw new Excp3();
	}
	public static void  main(String[] args) { 
		
		Day4 obj= new Day4();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 'a' or 'b' or ''c char for exception :");
		char s = sc.next().charAt(0);
		try {
			
			obj.fun(s); 
		}
		catch(Exception e){
			System.out.println("Exception caught");
		}
		finally{
			System.out.println("Finally: executing");
		}
	}
}
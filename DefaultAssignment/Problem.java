package gautam.assignment.main;
import gautam.assignment.singleton.Methods;
import gautam.assignment.data.Var;


public class Problem {
	public static void main(String[] args) {
		Var obj = new Var();
		obj.printUnini();
		obj.printLocal();
		Methods obj1 = Methods.fun("Hello World");
		obj1.printString();
	}
}

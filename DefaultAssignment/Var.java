package gautam.assignment.data;

public class Var {
	public int i;
	public char ch;
	public void printUnini() {
		System.out.println("Uninitialized variables integer i = " + i + " , character c = " + ch);
	}
	public void printLocal() {
		int j;
		char k;
		//java doesn't initialize local variables of a method as it does for class members
	}
}
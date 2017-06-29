package gautam.assignment.singleton;

public class Methods {
	public String str;
	public static Methods fun(String str1) {
		Methods s = new Methods();
		s.str = str1;
		return s;
	}
	public void printString() {
		System.out.println("String is :" + str);
	}
}

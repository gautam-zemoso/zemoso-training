
public class Day22{
	int i;
	public Day22(){
		this(5);
		System.out.println("Main Constructor");

	}

	Day22(int a){
		i=a;
		System.out.println("parameter Constructor");
	}
	public static void main(String [] args){
		new Day22();

	}
}

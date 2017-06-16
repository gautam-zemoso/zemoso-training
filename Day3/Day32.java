class Cycle { }

class Unicycle extends Cycle {
	void balance() {
		System.out.println("balancing Unicycle");
	}
}

class Bicycle extends Cycle {
	void balance() {
		System.out.println("balancing Bicycle");
	}
}

class Tricycle extends Cycle {
}

public class Day32 {
	public static void main(String[] args) {
		//upcasting
		Cycle [] obj={new Unicycle(), new Bicycle(), new Tricycle()};
		/* 
			for(Cycle i: obj) {
				i.balance();
			}
			Error becasue of  upcasting :-
			error: cannot find symbol
			i.balance();
			 ^
		  	symbol:   method balance()
		  	location: variable i of type Cycle
			1 error

		*/
		
		


		//downcasting
		Unicycle obj1= (Unicycle) obj[0];
		Bicycle obj2 =(Bicycle) obj[1];
		obj1.balance();
		obj2.balance();
	}
}


abstract class Rodent {
	Rodent() {
	 System.out.print("Rodent Class");
	}
	abstract void lifespan();
	abstract void speed();
}

class Mouse extends Rodent {
	Mouse() { 
		System.out.println(" Mouse SubClass");}
	void lifespan(){ System.out.println("Mouse lifespan 1yr ");}
	void speed() { System.out.println("Mouse speed = 20 Km/h \n");}
}

class Gerbil extends Rodent {
	Gerbil() { System.out.println("Gerbil SubClass");}
	void lifespan() { System.out.println("Gerbil lifespaning 5yr ");}
	void speed() { System.out.println("Gerbil speed = 60 Km/h \n");}
}

class Hamster extends Rodent {
	Hamster() { System.out.println("Hamster SubClass");}
	void lifespan() { System.out.println("Hamster lifespaning 12yr ");}
	void speed() { System.out.println("Hamster speed = 120 Km/h\n");}
} 

public  class Day31 {
	public static void main(String[] args) {
		Rodent[] obj= { new Mouse(), new Gerbil(), new Hamster()};

		for(Rodent i: obj) {
			i.lifespan();
			i.speed();
		}
	}
}
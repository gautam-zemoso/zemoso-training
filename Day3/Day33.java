interface Bycycle {
	void type();
	void weight();
}

interface Bike {
	void speed();
	void modelNo();
}

interface Car {
	void gear();
	void company();
}

interface Vehicle extends Bycycle, Bike, Car {
	void power();
}

class Automobile {
	public void travel() {
		System.out.println("Automobile class");
	}
}
// concrete class
class xyz extends Automobile implements Vehicle {
	public void type() {
		System.out.println("method of Bycycle");
	}
	public void weight() {
		System.out.println("method of Bycycle");
	}
	public void speed() {
		System.out.println("method of Bike");
	}
	public void modelNo() {
		System.out.println("method of Bike");
	}
	public void gear() {
		System.out.println("method of Car");
	}
	public void company() {
		System.out.println("method of Car");
	}
	public void power() {
		System.out.println("method of Vehicle");
	}
}

 class Day33 {
	public static void a(Bycycle bycycle) { 
		bycycle.type(); 
	}
	public static void b(Bike bike) { 
		bike.speed(); 
	}
	public static void c(Car car) { 
		car.gear(); 
	} 
	public static void d(Vehicle vehicle) { 
		vehicle.power();
	}
	

	public static void main(String[] args) {
		xyz obj = new xyz();
		a(obj);
		b(obj);
		c(obj);
		d(obj);
	}
}
import java.io.* ;

interface Cycle {

	void changeGear(int a);
	void speedUp(int a);
}

class Bicycle implements Cycle{
	int gear,speed;
	
	@Override
    public void changeGear(int newgr){
		gear = newgr;
	}

    @Override
    public void speedUp(int spd){
        speed = speed + spd;
    }   

	public void printStates(){
		System.out.println("The Speed of Bycycle is "+ speed +
		 "km/s and it is in gear number "+gear);
	}

}
class Unicycle implements Cycle{
	int speed;
    int gear;
     
    // to change gear
    //@Override
    @Override
    public void changeGear(int newGear){
         
        gear = newGear;
    }
     
    // to increase speed
    //@Override
    @Override
    public void speedUp(int increment){
         
        speed = speed + increment;
    }
        
    public void printStates() {
         System.out.println("speed: " + speed
             + " gear: " + gear);
    }
}
class Tricycle implements Cycle{
    int gear,speed;
    
    @Override
    public void changeGear(int newgr){
        gear = newgr;
    }

    @Override
    public void speedUp(int spd){
        speed = speed + spd;
    }   

    public void printStates(){
        System.out.println("The Speed of Tricycle is "+ speed +
         "km/s and it is in gear number "+gear);
    }

}

class Day34{
	public static void main(String[] args){
		 Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        
         
        System.out.println("Bicycle present state :");
        bicycle.printStates();
         
        // creating instance of Unicycle.
        Unicycle bike = new Unicycle();
        bike.changeGear(1);
        bike.speedUp(4);
       
         
        System.out.println("Unicycle present state :");
        bike.printStates();

        Tricycle tricycle = new Tricycle();
        tricycle.changeGear(2);
        tricycle.speedUp(3);
        
         
        System.out.println("Tricycle present state :");
        tricycle.printStates();

	}
}
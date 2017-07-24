import java.util.*;
public class BengaluruBrancFactory extends CabFactory{
	BengaluruBrancFactory(){
		miniRate = 10.00 ;
		microRate = 19.00 ;
		sedanRate = 36.00;
		suvRate = 16.50 ;
		city = new Bengaluru();
		this.addCabsInCity();
	}
	
	public void addCabsInCity() {

		ArrayList<Pair> cabs = new ArrayList<Pair>();
        cabs.add(new Pair(setCab("Micro"),false));
        cabs.add(new Pair(setCab("Micro"),false));
        cabs.add(new Pair(setCab("Mini"),false));
        cabs.add(new Pair(setCab("Mini"),false));
        cabs.add(new Pair(setCab("Sedan"),false));
        cabs.add(new Pair(setCab("Sedan"),false));
        cabs.add(new Pair(setCab("SUV"),false));
		cabs.add(new Pair(setCab("SUV"),false));	
		setCabList(cabs);
	}
	
}
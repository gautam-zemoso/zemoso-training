
import java.util.*;
public class HyderabadBrancFactory extends CabFactory{
	HyderabadBrancFactory(){
		miniRate = 10.00 ;
		microRate = 15.00 ;
		suvRate = 26.00;
		city = new Hyderabad();
		this.addCabsInCity();
	}
	
	public void addCabsInCity() {

		ArrayList<Pair> cabs = new ArrayList<Pair>();
        cabs.add(new Pair(setCab("Micro"),false));
        cabs.add(new Pair(setCab("Micro"),false));
        cabs.add(new Pair(setCab("Mini"),false));
        cabs.add(new Pair(setCab("Mini"),false));
        cabs.add(new Pair(setCab("SUV"),false));
		cabs.add(new Pair(setCab("SUV"),false));	
		setCabList(cabs);
	}
}
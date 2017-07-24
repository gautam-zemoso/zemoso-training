import java.util.*;
public class ChennaiBrancFactory extends CabFactory{
	ChennaiBrancFactory(){
		miniRate = 6.00 ;
		microRate = 10.00 ;
		sedanRate = 12.00;
		city = new Chennai();
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
        
		setCabList(cabs);
	}
	
}
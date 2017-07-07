import java.util.*;
public class Bengaluru extends City{

	Bengaluru(){
		cityName = "Bengaluru" ;
		sourceDestinationpair = new HashMap<String ,String>();
		sourceDestinationpair.put("D","B");
		sourceDestinationpair.put("F","C");
		sourceDestinationpair.put("A","E");
		sourceDestinationpair.put("A","F");
		cabList = new ArrayList<String>(Arrays.asList("Mini","Micro","Sedan","SUV"));
	}
	
	
}  
import java.util.*;
public class Hyderabad extends City{

	Hyderabad(){
		cityName = "Hyderabad" ;
		sourceDestinationpair = new HashMap<String ,String>();
		sourceDestinationpair.put("A","B");
		sourceDestinationpair.put("B","C");
		sourceDestinationpair.put("A","C");
		cabList = new ArrayList<String>(Arrays.asList("Mini","Micro","SUV"));
	}
	
	
}  
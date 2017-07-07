import java.util.*;
public class Chennai extends City{

	Chennai(){
		cityName = "Chennai" ;
		sourceDestinationpair = new HashMap<String ,String>();
		sourceDestinationpair.put("E","B");
		sourceDestinationpair.put("F","C");
		sourceDestinationpair.put("A","E");
		cabList = new ArrayList<String>(Arrays.asList("Mini","Micro","Sedan"));
	}
	
	
}  
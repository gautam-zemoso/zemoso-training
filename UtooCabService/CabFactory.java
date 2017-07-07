import java.util.*;
public abstract class CabFactory{
	protected double miniRate ;
	protected double microRate ;
	protected double suvRate ;
	protected double sedanRate ;
	protected City city = null;
	public Cab setCab(String cabName) {
		
			if(cabName.equals("Mini"))
				 return  new Mini(miniRate) ;
			else 
			if(cabName.equals("Micro"))
				 return  new Micro(microRate) ;
			else 
			if(cabName.equals("SUV"))
				 return  new SUV(suvRate) ;
			else 
			if(cabName.equals("Sedan"))
				 return  new Sedan(sedanRate) ;
			else	 	 	 	
				return  null ;
	} 
	public void showBooking(){
		Map<String ,String> sdPair = city.getSDpair();
		ArrayList<String > cabList = city.getCabList();
		double fair = 1.00 ; 
		city.showName();
		for (Map.Entry entry : sdPair.entrySet()) {
    		System.out.println("From Source "+entry.getKey() + " to Destination " + entry.getValue());
	    		for(String cabName : cabList){

					Cab  c = setCab(cabName);
					c.showRate();
				fair = city.getDist((String)entry.getKey() , (String)entry.getValue());
				fair = fair * (c.getRate());
				System.out.println("Total Fair is : "+ fair);
					
			}
		}	

}
}
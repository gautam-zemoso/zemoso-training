public class CityFactory{

	public CabFactory getCity(String city){
		if(city.equals("Hyderabad"))
			return new HyderabadBrancFactory();
		else if(city.equals("Bangaluru"))
			return new BengaluruBrancFactory();
		if(city.equals("Chennai"))
			return new ChennaiBrancFactory();
		else return null ;
		
	}
}  
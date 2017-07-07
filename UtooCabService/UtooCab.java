public class UtooCab{
	public static void main(String [] args){
		CityFactory cf = new CityFactory();
		CabFactory hbad  = cf.getCity("Bangaluru");
		//Cab c1 = hbad.setCab("Mini");
		// /c1.showRate();
		hbad.showBooking();

	}
}
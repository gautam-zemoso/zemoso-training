import java.util.*;

public class UtooCab{
	private static CityFactory cf = new CityFactory();
	public static  void showRecord(ArrayList<BookingRecord> bookingRecord){
		for(BookingRecord record : bookingRecord){
			System.out.println("Customer Name " + record.getCustomerName() +
			" booked in City" + record.getCity().getName() + 
			" with Car " +	record.getCab().getName() +
			" From " + record.getSource() +
			" To " + record.getDestination());
		}
	}
	public static void main(String [] args){
		ArrayList<BookingRecord> bookingRecord = new ArrayList<BookingRecord>();
		Scanner sc = new Scanner(System.in);
		char input;
		while(true){
			System.out.println("write a for booking , b for see all book record , c for exit");
			input=sc.next().charAt(0);
			if(input=='a'){
				booking(bookingRecord);
			}
			else if(input=='b'){
				showRecord(bookingRecord);
			}
			else {
				break ;
			}
		}


	}
	public static void booking(ArrayList<BookingRecord> bookingRecord){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter City");
		String name = sc.next();
		CabFactory cityName  = cf.getCity(name);
		City city = cityName.city ;
		city.showSourceDestinatonPair();
		System.out.println("Enter source-destination pair");
		String src ="",dest="" ;
		src=sc.next();
		dest=sc.next();
		cityName.showCabsInCity(src,dest);
		String customerName,cabName="",input="";
		System.out.println("Input customer name");
		customerName=sc.next();
		System.out.println("Give cab name");
		cabName=sc.next();
		Cab cab = cityName.setCab(cabName);
		cityName.book(cabName);
		bookingRecord.add(new BookingRecord(city,cab,customerName,src,dest));
	}
	
}
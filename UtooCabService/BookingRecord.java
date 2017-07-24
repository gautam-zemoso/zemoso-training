public class BookingRecord {
	private String customerName;
	private Cab cab;
	private City city;
	private String source;
	private String destination;
	private String bill;
	
	public BookingRecord(City city,Cab cab, String customerName, String source, String destination){
		this.cab = cab;
		this.customerName = customerName;
		this.source = source;
		this.destination = destination;
		this.city = city;
	}
	
	public City getCity() {
		return city;
	}
	public Cab getCab() {
		return cab;
	}

	public void setCab(Cab cab) {
		this.cab = cab;
	}

	public String getSource() {
		return source;
	}
	public String getDestination() {
			return destination;
		}
	public String getCustomerName() {
		return customerName;
	}
	
}
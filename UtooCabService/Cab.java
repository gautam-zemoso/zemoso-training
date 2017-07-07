public abstract class Cab{
	protected String carName ;
	protected double carRate ;
	public void showRate(){
		System.out.print("Car type "+carName+" have base rate (/Km) is "+carRate+"\n");
	}
	public double getRate(){
		return carRate ;
	}

}
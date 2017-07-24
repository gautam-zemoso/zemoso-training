public abstract class Cab{
	protected String cabName ;
	protected double cabRate ;
	public void showRate(){
		System.out.print("Car type "+cabName+" have base rate (/Km) is "+cabRate+"\n");
	}
	public double getRate(){
		return cabRate ;
	}
	public String getName(){
		return cabName ;
	}
	
}
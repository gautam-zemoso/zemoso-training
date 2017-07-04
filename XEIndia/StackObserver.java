
import java.util.* ;
public class StackObserver implements Observer{

	private double usd = 65.00;
	private double gbp = 80.00;
	private double euro = 69.00;
	private double inr ;
	public static int obID = 0 ;
	private int observerID ;
	private Subject Conversion ;
	public StackObserver(Subject Conversion,double inr){
		this.Conversion = Conversion ;
		this.inr = inr ;
		this.observerID = ++obID ;
		Conversion.register(this);
		print(); 
	}
	public void currency(double inr){
		this.inr = inr ;
	}
	public void print(){
			
			System.out.println("ObserverID : "+ observerID + "\n" + inr + " INR in USD ,GBP and EURO is \n"+
				(double) Math.round((double)(inr/usd) * 100.0)/100.0 +
				" USD, " + (double) Math.round((double)(inr/gbp) * 100.0)/100.0 +" GBP, " 
				+ (double) Math.round((double)(inr/euro) * 100.0)/100.0 + " EURO ");
		}
	@Override
	public void update(double usd ,double gbp ,double euro ){
		this.usd = usd ;
		this.gbp = gbp ;
		this.euro = euro;
		print();
	}
	
}


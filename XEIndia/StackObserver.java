
import java.util.* ;
public class StackObserver implements Observer{

	private double usd ;
	private double gbp ;
	private double euro ;
	private double inr ;
	public static int obID = 0 ;
	private int observerID ;
	private Subject conversion ;
	public StackObserver(Subject conversion,double inr){
		this.conversion = conversion ;
		this.inr = inr ;
		this.observerID = ++obID ;
		conversion.register(this);
		conversion.notifyObserver();
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


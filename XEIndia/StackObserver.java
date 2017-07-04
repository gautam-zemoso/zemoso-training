
import java.util.* ;
public class StackObserver implements Observer{

	private double usd;
	private double gbp;
	private double euro;
	public static int obID = 0 ;
	private int observerID ;
	private Subject Conversion ;
	public StackObserver(Subject Conversion){
		this.Conversion = Conversion ;
		this.observerID = ++obID ;
		Conversion.register(this) ; 
	}
	public void print(){
			System.out.println("ObserverID : "+ observerID + "\n1 USD = INR " + 		(double) Math.round(usd * 100.0)/100.0 +
				" 1 GBP = INR " + (double) Math.round(gbp * 100.0)/100.0 +" 1 EURO 		= INR " + (double) Math.round(euro * 100.0)/100.0);
		}
	@Override
	public void update(double usd ,double gbp ,double euro ){
		this.usd = usd ;
		this.gbp = gbp ;
		this.euro = euro;
		print();
	}
	
}

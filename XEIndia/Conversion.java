
import java.util.* ;
public class Conversion implements Subject{
	
	private double usd ;
	private double gbp ;
	private double euro ;
	private ArrayList<Observer> observers ;
	public Conversion(double usd , double gbp,double euro){
		observers = new ArrayList<Observer>();
		this.usd = usd ;
		this.euro = euro ;
		this.gbp = gbp ;

	}
	@Override 
	public void register(Observer o){
		observers.add(o);

	}
	@Override
	public void unregister(Observer o){
		int index = observers.indexOf(o);
		System.out.println("observer on index" + (index+1) + " is deleted.");
		observers.remove(index);
	}
	@Override
	public void notifyObserver(){
		for (Observer o : observers){
			o.update(usd,gbp,euro);
		}
	}
	public void setUSD(double usd){
		this.usd = usd ;
		notifyObserver();
	}

	public void setGBP(double gbp){
		this.gbp = gbp ;
		notifyObserver();
	}

	public void setEURO(double euro){
		this.euro = euro ;
		notifyObserver();
	}
}

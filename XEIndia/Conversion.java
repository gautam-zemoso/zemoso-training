
import java.util.* ;
public class Conversion implements Subject{
	
	private double usd = 65.00;
	private double gbp = 80.00;
	private double euro = 69.00;
	private ArrayList<Observer> observers ;
	public Conversion(){
		observers = new ArrayList<Observer>();
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

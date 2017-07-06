// import java.util.* ;
import java.util.*;
public  class Addon implements Subway{
	 Map<String , Double > addonItems = new HashMap<String ,Double> () ;
	public Addon(){
		addonItems.put("pickle",2.00);
		addonItems.put("salt",0.05);
		addonItems.put("masala",1.50);
	}
	private ArrayList<String> items = new ArrayList<String>();
	@Override
	public void getSpecification(String item){
		items.add(item) ;
	}
	@Override
	public double getCost(){
		double cost=0.00;
		for(String ingredient : items){
			cost += addonItems.get(ingredient) ; 
		}
		return cost;
	}
}
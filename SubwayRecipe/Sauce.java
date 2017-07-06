import java.util.* ;
public class Sauce implements Subway{
	private Map<String , Double> sauceItems = new HashMap<String ,Double> () ;
	public Sauce(){
		sauceItems.put("chilli",1.35);
		sauceItems.put("soya",2.50);
		sauceItems.put("tomato",1.00);
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
			cost += sauceItems.get(ingredient) ; 
		}
		return cost ;
	}
}
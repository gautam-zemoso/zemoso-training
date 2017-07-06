import java.util.* ;
public  class Salad implements Subway{
	private Map<String , Double > saladItems = new HashMap<String ,Double> () ;
	public Salad(){
		saladItems.put("onion",5.36);
		saladItems.put("tomato",2.36);
		saladItems.put("cabage",1.00);
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
			cost += saladItems.get(ingredient) ; 
		}
		return cost ;
	}
	
}
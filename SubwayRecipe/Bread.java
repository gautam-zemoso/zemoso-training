import java.util.* ;
public  class Bread implements Subway{
	private Map<String , Double > breadItems = new HashMap<String ,Double> () ;
	public Bread(){
		breadItems.put("egg",5.36);
		breadItems.put("flour",20.36);
		breadItems.put("yeast",2.00);
		breadItems.put("milk",20.00);
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
			cost += breadItems.get(ingredient) ; 
		}
		return cost ;
	}
	
}
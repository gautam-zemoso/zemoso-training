public class SimpleVeg extends MealBuilder{
	
	public  void addBread(){
		bread.getSpecification("flour");
		bread.getSpecification("yeast");
	}
	public  void addSauce(){
		sauce.getSpecification("chilli");
		sauce.getSpecification("tomato");
	}
	public  void addAddon(){
		addon.getSpecification("pickle");
		addon.getSpecification("salt");
	}
	public  void addSalad(){
		salad.getSpecification("onion");
		salad.getSpecification("tomato");
	}
	public double price(){
		double sum=0.00;
		sum += bread.getCost();
		sum += salad.getCost();
		sum += sauce.getCost();
		sum += addon.getCost();
		return sum ;
	}
}
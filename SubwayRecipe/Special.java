public class Special extends MealBuilder{
	public  void addBread(){
		bread.getSpecification("flour");
		bread.getSpecification("yeast");
		bread.getSpecification("egg");
		bread.getSpecification("milk");

	}
	public  void addSauce(){
		sauce.getSpecification("chilli");
		sauce.getSpecification("tomato");
		sauce.getSpecification("soya");

	}
	public  void addAddon(){
		addon.getSpecification("pickle");
		addon.getSpecification("salt");
		addon.getSpecification("masala");
	}
	public  void addSalad(){
		salad.getSpecification("onion");
		salad.getSpecification("tomato");
		salad.getSpecification("cabage");
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
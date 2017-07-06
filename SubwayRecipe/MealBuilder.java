public abstract class MealBuilder{
	protected Bread bread ;
	protected Subway salad ;
	protected Subway sauce ;
	protected Subway addon ;
	public MealBuilder(){
		bread = new Bread();
		sauce = new Sauce();
		salad = new Salad();
		addon = new Addon();
	} 
	public abstract void addBread();
	public abstract void addSauce();
	public abstract void addAddon();
	public abstract void addSalad();
	public abstract double price();

	
}
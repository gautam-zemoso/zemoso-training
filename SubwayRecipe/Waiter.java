public class Waiter{
	private MealBuilder mealBuilder ;
	public void setChoice(MealBuilder mealBuilder){
		this.mealBuilder = mealBuilder ;
	}
	public void makeMeal(){
		mealBuilder.addBread();
		mealBuilder.addSauce();
		mealBuilder.addSalad();
		mealBuilder.addAddon();

	}
	public double getPrice(){
		return mealBuilder.price();
	}
}
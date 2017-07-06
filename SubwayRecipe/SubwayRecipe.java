public class SubwayRecipe{
	public static void main(String [] args) throws Exception{
		Waiter waiter = new Waiter();
		MealBuilder simpleVeg = new SimpleVeg();
		MealBuilder simpleNonVeg = new SimpleNonVeg();
		MealBuilder special = new Special();
		waiter.setChoice(special);
		waiter.makeMeal();
		double cost = waiter.getPrice();
		System.out.print("The Cost for simpleVej Subway is \n"+ cost+ "\n");
	}
}
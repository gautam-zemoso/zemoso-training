public class PriceConversion {
	public static void main(String [] args){
		Conversion conversion = new Conversion(65.00,80.00,69.00) ;
		StackObserver ob = new StackObserver(conversion,1000) ;
		ob.currency(2000);
		conversion.setUSD(82.00) ;
		conversion.setGBP(70.00) ;

		conversion.setEURO(49.00) ;
		StackObserver ob1 = new StackObserver(conversion,1500) ;

		conversion.setEURO(69.00) ;
		conversion.unregister(ob);
	}
} 

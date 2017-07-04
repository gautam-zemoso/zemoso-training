public class PriceConversion {
	public static void main(String [] args){
		Conversion conversion = new Conversion() ;
		StackObserver ob = new StackObserver(conversion) ;
		conversion.setUSD(65.00) ;
		conversion.setGBP(80.00) ;
		conversion.setEURO(69.00) ;
		StackObserver ob1 = new StackObserver(conversion) ;

		conversion.setEURO(69.00) ;
		conversion.unregister(ob);
	}
} 
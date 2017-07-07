import java.util.*;
public abstract class City{
	protected String cityName ;
	protected ArrayList<String> cabList;
	protected  Map<String ,Double> cityLocation  = new HashMap<String ,Double>();
	protected Map<String,String> sourceDestinationpair ;
	City(){
		
		cityLocation.put("A",1.00);
		cityLocation.put("B",13.00);
		cityLocation.put("C",6.00);
		cityLocation.put("D",23.00);
		cityLocation.put("F",56.00);
		cityLocation.put("E",99.00);
	}
	public double getDist(String source ,String destination){
		double a = cityLocation.get(source);
		double b = cityLocation.get(destination);
		return Math.abs(a-b);
	}
	public  void setLocaionPair(String source ,String destination){
		sourceDestinationpair.put(source,destination);
	}
	public Map<String ,String> getSDpair(){
		return sourceDestinationpair ;
	}
	public ArrayList<String> getCabList(){
		return cabList;
	}
	public void showName(){
		System.out.println("City Name - "+cityName);
	}
}

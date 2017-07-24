import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public abstract class CabFactory{
	protected double miniRate ;
	protected double microRate ;
	protected double suvRate ;
	protected double sedanRate ;
	protected City city = null;
	ArrayList<Pair> cabList = new ArrayList<Pair>();
	Map<String,Integer> map=new HashMap<String,Integer>();
	public void setCabList(ArrayList<Pair> cabList){
		this.cabList = cabList ;
	}
	public Cab setCab(String cabName) {
		
			if(cabName.equals("Mini"))
				 return  new Mini(miniRate) ;
			else 
			if(cabName.equals("Micro"))
				 return  new Micro(microRate) ;
			else 
			if(cabName.equals("SUV"))
				 return  new SUV(suvRate) ;
			else 
			if(cabName.equals("Sedan"))
				 return  new Sedan(sedanRate) ;
			else	 	 	 	
				return  null ;
	} 
	
	public void showCabsInCity(String src,String dest) {
		ArrayList<String > cabs = new ArrayList<String> ();
		map.put("Micro",0);
		map.put("Mini",0);
		map.put("SUV",0);
		map.put("Sedan",0);
		
		for(Pair pair:cabList){
			if(pair.getY()==false)
				map.merge(pair.getX().getName(), 1, Integer::sum);
		}
		System.out.println("Cabs\tavailabilty");

		for(Entry<String,Integer> type:map.entrySet()){
			if(type.getValue() != 0){
			cabs.add(type.getKey());
			System.out.println(type.getKey()+"\t"+"true");}
			else{
			System.out.println(type.getKey()+"\t"+"false");
			}
		}
		System.out.println("kind of cab with cost");
		double fair = 1.00 ;
	     for(String cabName : cabs){
				Cab  c = setCab(cabName);
				c.showRate();
				fair = city.getDist(src, dest);
				fair = fair * (c.getRate());
				System.out.println("Total Fair is : "+ fair);
					
			}
	}
	abstract public void addCabsInCity();

	public void book(String cabName){
		for(Pair pair:cabList){
			if(pair.getX().getName().equals(cabName) &&  pair.getY()==false){
				pair.setY(true);
				break;
			}
				
		}
	}

}
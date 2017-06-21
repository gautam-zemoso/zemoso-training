import java.util.HashMap;
import java.util.Map ;
import java.io.* ;
public class Day8{
	public static void main(String [] args) throws Exception{
		HashMap<Character,Integer> mp = new  HashMap<> () ;

		FileReader fr = new FileReader("/home/zemoso/first_git_repo/FileHandling/sample.txt") ;
		// FileReader fr = new FileReader("/home/zemoso/Desktop/sample.txt");
		int i;
		while((i=fr.read()) != -1){
			//System.out.println((char) i  );
			if(! mp.containsKey((char ) i )){
				mp.put((char) i , 1);
			}
			else {
				Integer k = mp.get((char) i);
				mp.put((char) i , k+1);
				//mp[(char) i ] ++;
			}

		}
		// System.out.println(mp);
		FileWriter fw = new FileWriter("writetext.txt");
		// fw.write(print(mp));
		

		//Iterator<Character,Integer> i = mp.iterator();
		for (Map.Entry<Character, Integer> k : mp.entrySet())
		{
			if(k.getKey() <= 'z' && k.getKey()>= 'a')
		   fw.write("character - " +k.getKey() + " have frequency - " + k.getValue()+ "\n");
		}
		fw.close();
	}
}
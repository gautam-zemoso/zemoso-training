import java.io.*;
import java.util.*;

class PingProcess {
	String cmd;
	Process p;
	PingProcess(String str){
		cmd = "ping -c 5 " + str;
	}
	void pinging() {
		try{
			System.out.println("Pinging 5 times...");
			p = Runtime.getRuntime().exec(cmd);
			BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String str;
			List<Float> lst = new ArrayList<Float>();
			int c = 0;
        		while((str = r.readLine()) != null) {
        		System.out.println(str);	
				String[] tmp = str.split(" ");
           			if(c > 0 && c < 6){lst.add(Float.valueOf(tmp[7].substring(5)));}
				c++;
        		}
			p.waitFor();
			p.destroy();
			System.out.println("Median time taken to ping :  " + medianTime(lst));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	float medianTime(List<Float> lst) {
		Collections.sort(lst);
		return lst.get(lst.size()/2);
	}
}

public class Assignment3 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter web address: ");
		String str = sc.next();
		PingProcess p = new PingProcess(str);
		p.pinging();
	}
}	

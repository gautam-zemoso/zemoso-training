import java.util.*;
public class User{
	public static void main(String [] args){
		DoctorFacade doctorfacade =new DoctorFacade("Applo");
		Scanner sc = new Scanner(System.in);
		String str ="";
		ArrayList<String> specialization = new ArrayList<>(Arrays.asList("a","c","d"));
		doctorfacade.addDoctor("K.Misra",specialization);
		specialization = new ArrayList<>(Arrays.asList("a","b","d","c"));
		doctorfacade.addDoctor("D.Roy",specialization);
		specialization = new ArrayList<>(Arrays.asList("d","c"));
		doctorfacade.addDoctor("G.Kumar",specialization);
		doctorfacade.showDocChart();
		System.out.println("-------------------------");
		System.out.println("Enter specialization prefered");
		str=sc.next();
		doctorfacade.bookAppointment(str);	
		doctorfacade.showDocChart();
	}
	


}



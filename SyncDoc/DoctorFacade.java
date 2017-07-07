import java.util.* ;
public class DoctorFacade{
	ArrayList<String> specializations = new ArrayList<>(Arrays.asList("a","b","c","d"));
	ArrayList<String> timing ;
	ArrayList<Doctor> docList = new ArrayList<Doctor> ();
	HospitalList hospitalname;
	DoctorFacade(String hName){
		hospitalname = new HospitalList(hName);
		timing = new ArrayList<>(Arrays.asList("Morning","Afternoon","Evening","Night"));
	}
	public void addDoctor(String docName,ArrayList<String> specialization ){
		Doctor doc = new Doctor(docName);
		for(String str : specialization)
			doc.setSpecialization(str);
		for(String str : timing)
			doc.addTime(str);
		
		docList.add(doc);	
	}
	void bookAppointment(String spec){
		System.out.println("Doctor Avilable list:");
		for(Doctor doc : docList){
			if(doc.hasSpecialization(spec)){
			System.out.println(doc.getDocName() + " has time avilable ");
			for(String time : doc.getTime())
				System.out.print(time + "  ");
			System.out.println();				
			}
		}
		System.out.println("Enter prefered Doctor and Timing");
		Scanner sc = new Scanner(System.in);
		String docName="";
		docName = sc.next();
		String docTime="";
		docTime = sc.next();
		getRemove("K.Misra","Morning");
	}
	void showDocChart(){
		for(Doctor doc : docList){
			System.out.println(doc.getDocName() + " has specializations");
			ArrayList<String> sp =  doc.getSpecialization();
			for(String spec : sp)
				System.out.print(spec + "  ");
			System.out.println("\n Doctor Avilable Time");		
			for(String time : doc.getTime())
				System.out.print(time + "  ");
			System.out.println();			
		}

	}
	void getRemove(String docName ,String docTime){
		for( Doctor doc : docList){
			if((doc.getDocName()).equals(docName)){
				doc.bookTime(docTime);
				break;
			}				
		}		
	}
}
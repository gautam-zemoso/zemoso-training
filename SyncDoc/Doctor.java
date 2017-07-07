import java.util.* ;
public class Doctor implements DocInfo{
	// private int docId ;
	private String docName ;
	private ArrayList<String> doc_specialization = new ArrayList<String>();
	private ArrayList<String> doc_time = new ArrayList<String>();
	// private ArrayList<Appoinment> doc_appoinment ;
	Doctor(String docName){
		this.docName = docName;	
	}
	@Override
	public void setDocName(String doctorName){
		this.docName = doctorName; 
	}
	public String getDocName(){
		return  docName; 
	}
	// publiic Doctor
	@Override
	public void setSpecialization(String specialization){
		//if(!Arrays.asList(doc_specialization).contains(specialization))
			doc_specialization.add(specialization);
	}
	public boolean hasSpecialization(String spec){
		if(doc_specialization.contains(spec))
			return true;
		else return false ;
	}
	public ArrayList<String> getSpecialization(){
		return doc_specialization;
	}
	@Override
	public void setTime(String time){
		doc_time.add(time);
	}

	public ArrayList<String> getTime(){
		return doc_time ;
	}
	public void addTime(String time){
		doc_time.add(time);
	}
	public void bookTime(String time){
		doc_time.remove(time);
	}
	// public bookappoinment(Appoinment appoinment){

	// }
	
	
	
}
import java.util.* ;
public class HospitalList implements Hospital{
	private String hName ;

	private ArrayList<Doctor> doctorList = new ArrayList<Doctor>() ;
	public HospitalList(String hName){
		this.hName = hName ;
		doctorList = new ArrayList<Doctor>();
		System.out.println("Welcome to "+hName + " Hospital");
	}
	@Override
	public void setDoctorList(Doctor doctor){
		if(!Arrays.asList(doctorList).contains(doctor))
		doctorList.add(doctor);
	}
}
import java.util.*;
import java.text.*;
import java.util.concurrent.TimeUnit;
class RangeDate {
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	Date signupdate;
	Date currentdate;
	RangeDate(String signdate, String currdate) {
		try{
			signupdate = sdf.parse(signdate);
			currentdate = sdf.parse(currdate);
		}catch(Exception e){}
	}
	boolean validateCurrentDate() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(signupdate);
		cal.add(Calendar.YEAR, 1);
		cal.add(Calendar.DATE, -30);
		Date curr = cal.getTime();
		return (currentdate.getTime() >= curr.getTime());
	}
	Date anniversary() {
		long diff = currentdate.getTime() - signupdate.getTime();
		int years = (int)TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS)/365;
		Calendar cal = Calendar.getInstance();
		cal.setTime(signupdate);
		cal.set(Calendar.YEAR, cal.get(Calendar.YEAR) + years); 

		Date anvr = cal.getTime();
		cal.add(Calendar.YEAR, 1);
		cal.add(Calendar.DATE, -30);
		Date temp = cal.getTime();
		if(currentdate.getTime() >= temp.getTime()){
			cal.add(Calendar.DATE, 30);
			return cal.getTime();
		}
		else
			return anvr ;
	}
	
	void range() {
		Date anvr = anniversary();
		if(validateCurrentDate()) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(anvr);
			cal.add(Calendar.DATE, -30);

			Date start = cal.getTime();
			cal.add(Calendar.DATE, 60);
			Date end = cal.getTime();
			if(end.getTime() > currentdate.getTime()) {
				System.out.println("Range " + sdf.format(start) + " - " + sdf.format(currentdate));
			}else{
				System.out.println("Range " + sdf.format(start) + " - " + sdf.format(end));
			}
		}else{System.out.println("No range");}	
	}
}
public class Assignment4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter sign up date (use format \"dd-mm-yyyy\")  : ");		
		String signdate = sc.nextLine();
		System.out.print("Enter current up date (use format \"dd-mm-yyyy\")  : ");
		String currdate = sc.nextLine();
		RangeDate fdr = new RangeDate(signdate, currdate);
		fdr.range();
	}
}
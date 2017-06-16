public class Day24{
	Day24(String str){
		System.out.println("Constructor  " + str);
	}
	public static void main(String [] args){
		Day24[] arr = new Day24[5]; 
		for(int i=0;i<5;i++){
			arr[i] = new Day24("alpha " + i) ;
		}

	}
} 
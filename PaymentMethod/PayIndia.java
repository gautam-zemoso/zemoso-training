import java.util.*;
public class PayIndia{
	public static void main(String [] args){
		PayMethodFactory pmf = new PayMethodFactory() ;
		PayMethod paymethod = null ;
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Enter payment Method\nCreditCard\n DebitCard\n"+
			"NetBanking \nWallet\nCOD\n");
		String str="";
		str = sc.next();
		 System.out.print("Enter Amount for Txn\t");
		double amount = sc.nextInt();
		paymethod = pmf.getMethod(str,amount);
		payment(paymethod);

	}
	public static void  payment(PayMethod paymethod){
		paymethod.currentMethod();
		paymethod.txnAmount();
	}
}
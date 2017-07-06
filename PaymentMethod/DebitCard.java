public class DebitCard extends PayMethod{
	//private double amount;
	public DebitCard(double amount){
		setName("Debit Card");
		setTxn(amount);
	}
	
}
public abstract class PayMethod{
	private String name ;
	private double amtTxn ;
	public void setName(String name){
		this.name = name ;
	}
	public String getName(){
		return this.name ;

	} 
	public void setTxn(double amtTxn){
		this.amtTxn = amtTxn ;
	}
	public double getTxn(){
		return this.amtTxn ;

	} 
	public void currentMethod(){
		System.out.println("Currently Payment is done via "+ getName());

	}
	public void txnAmount(){
		System.out.println("Txn amount is "+ getTxn());		
	}
}
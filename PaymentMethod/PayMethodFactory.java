public class PayMethodFactory{
	public PayMethod getMethod(String str,double amount){
		PayMethod newMethod = null ;
		if(str.equals("CreditCard")){
			return new CreditCard(amount);
		}
		else if(str.equals("DebitCard")){
			return new DebitCard(amount);
		}
		else if(str.equals("NetBanking")){
			return new NetBanking(amount);
		}
		else if(str.equals("COD")){
			return new Cod(amount);
		}
		else if(str.equals("Wallet")){
			return new Wallets(amount);
		}
		else {
			return null ;
		}
	}
}
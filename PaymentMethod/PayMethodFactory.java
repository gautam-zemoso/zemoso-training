public class PayMethodFactory{
	public PayMethod getMethod(String str){
		PayMethod newMethod = null ;
		if(str.equals("CreditCard")){
			return new CreditCard();
		}
		else if(str.equals("DebitCard")){
			return new DebitCard();
		}
		else if(str.equals("NetBanking")){
			return new NetBanking();
		}
		else if(str.equals("COD")){
			return new Cod();
		}
		else if(str.equals("Wallet")){
			return new Wallets();
		}
		else {
			return null ;
		}
	}
}
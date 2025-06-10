package Day4;
   //Bank details
class SbiAcc{
	private String Accholder;
	private int balance;
	SbiAcc(String Accholder,int balance){
		this.Accholder=Accholder;
		this.balance=balance;
	}
	public String getAccholder() {
		return Accholder;
		}
	public int getbalance() {
		return balance;
	}
	public void Deposite(int dep) {
		if (balance>0) {
			balance +=dep;
	    System.out.println("Deposite Amount :"+dep);
	    System.out.println("Total amt:"+ balance);
		}
	}
	public void setAccholder(String Accholder) {
		this.Accholder=Accholder;
	}
	public void setWithdraw(int withdraw) {
		balance -= withdraw;
		System.out.println("Withdraw amount:"+withdraw);
	}
}
public class Task1 {
      public static void main(String[]args) {
    	  SbiAcc ac=new SbiAcc("Abi", 30000);
    	  System.out.println("Account holder name :"+ ac.getAccholder());
    	  ac.setAccholder("Pappilu..");
    	  System.out.println("update account holder :"+ac.getAccholder());
    	  ac.Deposite(50000);
    	  ac.setWithdraw(30000);
    	  System.out.println("Avalabile bal:"+ac.getbalance());
    	 
      }
}

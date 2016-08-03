/*
 * Overriding 
 * 1. Must be Inheritance
 * 2. Some Feature is coming from the parent and child want to override it
 * the reason is the parent feature is outdated, that's why child want to override
 * Signature must be same when you are doing overriding
 */
abstract class Account
{
	int accountNo;
	double balance;
	void withDraw(){
		System.out.println("Account Class WithDraw Call");
	}
	void deposit(){
		System.out.println("Account Class Deposit Call");
	}
	abstract void roi();
//	void roi(){
//		System.out.println("The Generic One...");
//	}
}
class CurrentAccount extends Account
{
	@Override
void roi(){	
	System.out.println("Current A/C ROI Need to Pay");
}
	void odLimit(){
		System.out.println("Current Account has OD Limit...");
	}
}
class SavingAccount extends Account{
	@Override
	void roi(){
		System.out.println("Saving A/C ROI Need to Rec");
	}
}
class AccountCaller{
	void callAccount(Account account){
		account.deposit();
		account.withDraw();
		account.roi();
		if(account instanceof CurrentAccount){
		CurrentAccount ca = (CurrentAccount) account; // Downcasting
		ca.odLimit();
		}
	}
}
public class ISADemo {

	public static void main(String[] args) {
		
		//Account account = new Account();
		//Account account = new SavingAccount();
		AccountCaller accountCaller = new AccountCaller();
		accountCaller.callAccount(new SavingAccount());
		System.out.println("**************************************");
		accountCaller.callAccount(new CurrentAccount());
		// TODO Auto-generated method stub
//		Account account = new SavingAccount(); // Upcasting
//		account.deposit();
//		account.withDraw();
//		account.roi();
//		System.out.println("**************************************");
//		account = new CurrentAccount();
//		account.deposit();
//		account.withDraw();
//		account.roi();
//		CurrentAccount ca = (CurrentAccount) account; //Downcasting
//		ca.odLimit();
//		
				
//		SavingAccount sa = new SavingAccount();
//		sa.deposit();
//		sa.withDraw();
//		sa.roi();
//		
//		CurrentAccount ca = new CurrentAccount();
//		ca.deposit();
//		ca.withDraw();
//		ca.roi();
//		ca.odLimit();
//		
	}

}

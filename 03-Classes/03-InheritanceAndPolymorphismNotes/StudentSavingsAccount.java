
public class StudentSavingsAccount extends BankAccount {

	int overdraftsBeforeFee;
	
    public StudentSavingsAccount() {
        
    		  // This WILL NOT work!
//        balance = 0;
//        name = "";
//        accountNumber = masterAccountNumber;
//        masterAccountNumber++;
    	
    	
    		  // This WILL work!
//        setBalance(0);
//        setName("");
    	
    		super();
    	    overdraftsBeforeFee = 3;
    		System.out.println("Default constructor called [StudentSavingsAccount]");
    	    
    		
    
    }

    // Constructor that takes the starting balance and a name
    public StudentSavingsAccount(double bal, String name) {

    		super(bal, name);
//    	    super();
//    	    setName(name);
//    	    setBalance(bal);
    	    overdraftsBeforeFee = 3;
    	    System.out.println("double, String constructor called [StudentSavingsAccount]");	

    }
    
    public void test() {
    		System.out.println("This method is unique to StudentSavingsAccounts");
    }
    
    public void withdraw(double amt) {

    		System.out.println("Withdraw [StudentSavingsAccount]");
    		
//    		super.withdraw(amt);
//    		
//    	    if (overdraftsBeforeFee > 0) {
//    	    		setBalance(getBalance() - amt);
//    	    		overdraftsBeforeFee--;
//    	    }

            if (amt < 0) {
                if (overdraftsBeforeFee > 0 ) {
                	 setBalance(getBalance() - amt);
                	 overdraftsBeforeFee--;
                }
                return;
            }

            if (amt > getBalance()) {
                System.out.println("Insufficient funds");
                return;
            }

            setBalance(getBalance() - amt);
            System.out.println("The balance for account number " + getAccountNumber() + " is " + getBalance());    		
    		
    }    
	
}

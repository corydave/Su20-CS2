
import java.util.ArrayList;

public class InheritanceDemo {

	public static void main(String[] args) {

//		BankAccount ba1 = new BankAccount(100, "Dave");
//		System.out.println(ba1);
//		
//		System.out.println();
//		
//		BankAccount ba2 = new BankAccount(200, "John");
//		System.out.println(ba2);
//		
//		System.out.println();
//		
//		ba1.setBalance(300);
//		System.out.println(ba1);
//		
//		BankAccount ba3 = ba1;
//		ba3.setBalance(400);
//		System.out.println(ba1);
//		
//		System.out.println();
//		
//		
//
//		ba1.setBalance(500);
//		System.out.println(ba1);
//		
//		System.out.println();
//		
//		ArrayList list1 = new ArrayList();
//		list1.add(ba1);
//		
//		ArrayList list2 = new ArrayList();
//		list2.add(ba1);
//		list2.add(ba3);

//		BankAccount ba4 = new BankAccount(100, "Cole");
//		StudentSavingsAccount sa1 = new StudentSavingsAccount();
		
//		StudentSavingsAccount sa2 = new StudentSavingsAccount(100, "Cole");
//		sa2.deposit(201);
//		System.out.println(sa2);
		
//		StudentSavingsAccount ba5 = new StudentSavingsAccount(100, "Dave");
		BankAccount ba5 = new StudentSavingsAccount(100, "Dave");
		((StudentSavingsAccount)ba5).test();
		
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		accounts.add(new BankAccount(100, "Dave"));
		accounts.add(new StudentSavingsAccount(200, "Katie"));
		accounts.get(0).deposit(200);
		accounts.get(1).deposit(300);
		
		if (accounts.get(1) instanceof StudentSavingsAccount) {
			((StudentSavingsAccount)accounts.get(1)).test();
		}

		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		for (int i = 0; i < accounts.size(); i++) {
			accounts.get(i).withdraw(1);
		}
		

		
		
		
		
//		BankAccount ba6 = new BankAccount(200, "Katie");
//		((StudentSavingsAccount)ba6).test();
		
//		sa1.setName("Joey");
//		System.out.println(ba4);
//		System.out.println(sa1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}














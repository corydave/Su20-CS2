import java.util.Scanner;
import java.util.InputMismatchException;


public class Error {

	public static void main(String[] args) {

		System.out.println("GAME ON!!!!");
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		try {
		
			Thread.sleep(1000);
				
			Person p = new Person("Dave");
			System.out.println(p.getName());
			
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println(a/b);
			
			doSomething();
		
		
		} catch (InputMismatchException e) {
			
			System.out.println("You did not type in an INT");
			System.out.println("This program will now terminate.");
//			System.out.println(e);
//			throw e;
//			System.exit(-1);
			
		} catch (ArithmeticException e) {
			
			System.out.println("An Arithmetic issue happened.");
			System.out.println("Probably, you divided by zero.");
			
		} catch (TooManyDavesException e) {
			
			System.out.println("Sorry! You can't name it Dave!");
		
		} catch (Exception e) {
			
			System.out.println("Something bad happened.");
			System.out.println("Maybe this will help?");
			System.out.println(e);
			
		}
		
		
		
		
		System.out.println("GAME OVER MAN!!!!");
		
		
		
	}
	
	public static void doSomething() throws TooManyDavesException {
	
//	try {
	
			Person p = new Person("Dave");
		//
		
//	} catch (Exception e) {
//		
//		System.out.println("The method 'doSomething()' has crashed");
//		
//	}
		
	
	}

}

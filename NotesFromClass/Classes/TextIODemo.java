import java.util.Scanner;

public class TextIODemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		java.io.File file = new java.io.File("input.txt");
		
		try {
			
			Scanner input = new Scanner(file);
			
			String tempInput;
			
			while (input.hasNext()) {
			
				tempInput = input.nextLine();
				System.out.println(tempInput);

			}
			

			
//			tempInput = input.nextLine();
//			System.out.println(tempInput);

		
		}
		
		catch (Exception e) {
			
			System.out.println("There was an error!");
			System.out.println(e);
			System.out.println();
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("GAME OVER MAN!");
		scanner.close();
		
	}

}

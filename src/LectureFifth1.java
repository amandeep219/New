import java.util.InputMismatchException;
import java.util.Scanner; 
public class LectureFifth1 {
	
	public static void main(String[] args) { 
		Scanner readInput = new Scanner(System. in );
		float myFloat1 = 0.0f; 
		float myFloat2 = 0.0f;
		System. out .println("\nWelcome to get two floats program\n\n");
		do {
			System. out .print("Enter two floats separated by a space: ");
			try {
				myFloat1 = readInput.nextFloat(); 
				myFloat2 = readInput.nextFloat(); 
				break; 
			} catch (final InputMismatchException e) { 
				 System. out .println("You have entered an invalid input. Try again.");
				 readInput.nextLine(); 
				 continue; 
			 }   
			} while (true);
		System. out .println("\nYou entered two valid floats: "
				+ myFloat1 + " and " + myFloat2);
		System. out .println("Thank you for giving two floats");
		
			}
				
			
		
		
	}



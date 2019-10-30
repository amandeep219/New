
import java.util.InputMismatchException; 
import java.util.Scanner; 

public class LectureFifth {
	public static void main(String[] args) { 
		Scanner readInput = new Scanner(System. in );  
		int inputInt;
		System. out .println("\n\nWelcome to sorting program\n\n\t1.              "
				+ "Title\n\t2. Rank\n\t3. Date\n\t4. Stars\n\t5. Likes\n\n ");
		do { // Loop until we have correct input    
			System. out .print("Enter your choice between 1 and 5   only:: "); 
			try 
			{    
				inputInt = readInput.nextInt();
				if (inputInt >= 1 && inputInt <= 5) { 
					break; 
				} else {     
					System. out .println("You have not entereda number between 1 and 5. Try again.");     
					continue;   
				}
			} catch (final InputMismatchException e) {   
				System. out .println("You have entered an invalid                                               "
						+ "choice. Try again.");
				readInput.nextLine(); 
				continue; 
			}   } while (true); 
		System. out .println("\nYou entered valid choice " +
				 inputInt);
		System. out .println("Thank you for giving your choice");
			
			
			}
			
		

}

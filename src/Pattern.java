// program to print the “X” pattern:

public class Pattern { // create a class

	public static void main(String[] args) { 	// Main Method
		int i, j; // Declaration	
		for (i = 0; i <= 4; i++) { 				// Applying loop
			for (j = 0; j <= 4; j++) {			 // Applying loop
				if (i == j || i == 4 && j == 0 || i == 3 && j == 1 || i == 1 && j == 3 || i == 0 && j == 4) // logic
																											// if
																											// condition
					System.out.print("*"); 	// for output on the screen
				else 						// else condition
					System.out.print("-"); 	// for output on the screen
			}
			System.out.println(); 			// for new line

		}

	}
}
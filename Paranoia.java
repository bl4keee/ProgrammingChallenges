import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Paranoia {
		
		// Declarations
		private Scanner scanner;
		ArrayList<String> scales = new ArrayList<String>();
		ArrayList<Integer> amounts = new ArrayList<Integer>();
		ArrayList<String> allExpenses = new ArrayList<String>();

		// Method opening the file "expenses"
		public void openFile() {
			try {
				scanner = new Scanner(new File("C:\\Users\\BARTEK\\Desktop\\expenses.txt"));
			} catch (Exception e) {
				System.out.println("Could not find the file.");
			}
		}
		
		// Method reading data from the file "expenses" 
		public void readFile() {
			System.out.println("Printing expenses...\n");
			while (scanner.hasNext()) {
				String month = scanner.next();
				String reason = scanner.next();
				int amount = scanner.nextInt();
				amounts.add(amount);
				String scale = scanner.next();
				scales.add(scale);
				
				System.out.printf("%s %s %s %s\n", month, reason, amount, scale);
			
			}
}
		
		// Method searching for the biggest expense
		public void search() {		
			System.out.println("");
			int maxAmount = Collections.max(amounts); // get the biggest expense
			int indexOfAmount = amounts.indexOf(maxAmount); // get the index of the biggest expense
			String maxScaleStr = scales.get(indexOfAmount); // read the String by the index of the biggest expense
			System.out.println("The biggest expense is " + maxAmount + " " + maxScaleStr + " (K = thousand).");
		}
	
	
		
		// Method closing the file "expenses"
		public void closeFile() {
			scanner.close();
		}
		
	}



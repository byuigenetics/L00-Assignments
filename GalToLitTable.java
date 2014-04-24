class GalToLitTable {

		public static void main(String args[]) {

			double gallons; // number of gallons
			double liters; // conversion from gallons to liters
			int counter;
	counter = 0;
	for(gallons = 1; gallons <= 100; gallons++) {
	  liters = gallons * 3.7854; // converts gallons to liters
	  System.out.println(gallons + " gallons is " + liters + " liters.");
	  
	  counter++;
	  // every 10th line print a blank line
	  if(counter == 10){
		System.out.println();  
		System.out.println(); // I modified the code to print 2 blank lines so the spaces are more noticable
		counter = 0; // reset the line counter
	}
	}
	}
	}

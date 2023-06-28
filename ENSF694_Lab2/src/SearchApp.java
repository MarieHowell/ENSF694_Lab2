import java.util.Arrays;
public class SearchApp {
	
	private InteractiveCLI cli;
	private LinearSearch linear; 
	private InterpolationSearch intpol; 
	
	/**
	 * SearchApp constructor initializes new InteractiveCLI object. 
	 */
	public SearchApp() {
		
		cli = new InteractiveCLI();
	}
	public void run() {
		
		int numElements; 
		int [] searchArray; 
		int key; 
		
		this.cli.display("Search an Integer Array by Key."); 
		this.cli.prompt(" Enter the number of elements in the array > ");
		numElements = this.cli.getKeyboardInteger(); // gets principal as a double from user 
		searchArray = new int[numElements]; 
		
		this.cli.display(" Enter the elements in the array > ");
		
		for(int i =0; i < numElements; i++) {
			this.cli.prompt(""); 
			searchArray[i] = this.cli.getKeyboardInteger();
		}
		
		this.cli.prompt(" Enter the search key > ");
		key = this.cli.getKeyboardInteger();
		
		System.out.println(numElements); 
		System.out.println(Arrays.toString(searchArray));
		System.out.println(key); 
		
		//linear search
		this.cli.display("Using Linear Search:" + "\nArray: " + Arrays.toString(searchArray)+ "\nKey: " + key); 
	
		linear = new LinearSearch(key,searchArray); 
		long startTime = System.nanoTime(); 
		if (linear.searchArrayLinear()) {
		
			this.cli.display("Search key FOUND at index " + linear.getIndexLinear());
		}
		else {
			this.cli.display("Search key NOT FOUND");
		}
		long stopTime = System.nanoTime(); 
		System.out.println("Time to run: " + (stopTime - startTime)); 
		
		//Interpolation search
		this.cli.display("\nUsing Interpolation Search:" + "\nArray: " + Arrays.toString(searchArray)+ "\nKey: " + key);
		intpol = new InterpolationSearch(key,searchArray); 
		startTime = System.nanoTime();
		if (intpol.searchArrayIntpol()) {
			
			this.cli.display("Search key FOUND at index " + intpol.getIndexIntpol());
		}
		else {
			this.cli.display("Search key NOT FOUND");
		}
		stopTime = System.nanoTime(); 
		System.out.println("Time to run: " + (stopTime - startTime)); 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initializes new BankCDApp object and runs app.
		SearchApp app = new SearchApp();
		app.run();
	}

}




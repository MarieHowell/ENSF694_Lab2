
public class LinearSearch {
	private int key; 
	private int [] array; 
	private int index; 
	
	public LinearSearch(int k, int [] a) {
		this.key = k;
		this.array = a; 
	}
	
	public boolean searchArrayLinear() {
		boolean found = false; // default to false
		
		for(int i = 0; i < array.length; i ++)
		{
			if(array[i] == key) {
				found = true; //key FOUND set true
				this.index = i; 
				break; 
			}
		}
		
		return found; 
	

	}
	
	public int getIndexLinear() {
		return index; 
	}
}

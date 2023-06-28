
public class InterpolationSearch {
	private int key; 
	private int [] array;  
	
	public InterpolationSearch(int k, int [] a) {
		this.key = k;
		this.array = a; 
	}
	
	public boolean searchArrayIntpol() {
		
		int low = 0, mid,pos,high = array.length -1; 
		
		while (low <= high) {
			pos =(key - array[low])/(array[high] - array[low]); 
			mid = low + ((high - low)* pos); 
			 
			if (key < array[mid])
				high = mid - 1; 
			else if (array[mid] < key)
				low = mid + 1; 
			else 
				return true; 
		}
		
		return false; 
		
	}
	
	public int getIndexIntpol() {
		
		for(int i = 0; i < array.length; i++) {
			if (array[i] == key)
				return i; 
		}
		return 0; 
	}
}




public class Delete {
	
	public static void printArray(int[] a)
	{
		System.out.println("Akaash Banerjee. " + "Array Length: " + a.length);
		for(int i = 0; i<a.length; i++){
			System.out.println(a[i]);
			
			
			}
	}
	
	public static void main (String[] args) {
		int array[] = {2, 3, 4, 5, 6, 9, 10, 17, 19, 20};
		printArray(array);
		int deletion = 10;
		int currentSize = array.length+1;
		for(int i = 0; i<currentSize; i++){
			if(array[i] == deletion) {
				
				array[i] = array[array.length-1];
				currentSize = currentSize-1;
				
				
				
				}
			}
			for(int f = 0; f<currentSize-1; f++){
			System.out.println(array[f]);
	}
}
}


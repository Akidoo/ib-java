


public class Delete {
	
	public static void printArray(String[] a)
	{
		System.out.println("Akaash Banerjee. " + "Array Length: " + a.length);
		for(int i = 0; i<a.length; i++){
			System.out.println(a[i]);
			
			
			}
	}
	
	public static void main (String[] args) {
		String array[] = {"Jaziel", "Annika", "Kimber", "Amelie", "Nikola", "Taliah", "Abdiel", "Fredy", "Zakai", "Karly"};
		printArray(array);
		String deletion = "Annika";
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


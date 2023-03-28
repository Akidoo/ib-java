


public class Delete {
	
	public static void printArray(String[] a)
	{
		System.out.println("Akaash Banerjee. " + "Array Length: " + a.length);
		for(int i = 0; i<a.length; i++){
			System.out.println(a[i]);
			
		}
			}
	public static void deleteElement(String[] a)
	{
		String deletion = "Annika";
		int currentSize = a.length+1;
		for(int i = 0; i<currentSize; i++){
			if(a[i] == deletion) {
				
				a[i] = a[a.length-1];
				currentSize = currentSize-1;
				
				
				
				}
			}
			for(int f = 0; f<currentSize-1; f++){
			System.out.println(a[f]);
		
		
		}
	}
	
	public static void main (String[] args) {
		String array[] = {"Jaziel", "Annika", "Kimber", "Amelie", "Nikola", "Taliah", "Abdiel", "Fredy", "Zakai", "Karly"};
		printArray(array);
		deleteElement(array);
}
}


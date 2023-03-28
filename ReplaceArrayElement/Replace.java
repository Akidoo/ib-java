

public class Replace {
	
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
		String Replacement = "Annika";
		for(int i = 0; i<array.length; i++){
			if(array[i] == Replacement) {
				
				array[i] = "Anthony";
				
				
				
				}
			}
			for(int f = 0; f<array.length; f++){
			System.out.println(array[f]);
	}
}
}


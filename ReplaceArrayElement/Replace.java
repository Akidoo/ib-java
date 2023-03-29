

public class Replace {
	
	public static void printArray(String[] a)
	{
		System.out.println("Akaash Banerjee. " + "Array Length: " + a.length);
		for(int i = 0; i<a.length; i++){
			System.out.println(a[i]);
			
			
			}
	}
	public static void replaceElement(String[] a)
	{
		String Replacement = "Annika";
		for(int i = 0; i<a.length; i++){
			if(a[i] == Replacement) {
				
				a[i] = "Anthony";
				break;
				}
			}
			for(int f = 0; f<a.length; f++){
			System.out.println(a[f]);
		
		}
	}
	
	public static void main (String[] args) {
		String array[] = {"Jaziel", "Annika", "Kimber", "Amelie", "Nikola", "Taliah", "Annika", "Fredy", "Zakai", "Karly"};
		printArray(array);
		replaceElement(array);
	}
}



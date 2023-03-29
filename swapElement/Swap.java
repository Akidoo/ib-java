


public class Swap {
	
	public static void printArray(String[] a)
	{
		System.out.println("Akaash Banerjee. " + "Array Length: " + a.length);
		for(int i = 0; i<a.length; i++){
			System.out.print(a[i]);
			if(i<a.length-1){
				System.out.print(", ");
				
				}
		}
		System.out.println("");
			
			}
	public static void replaceElement(String[] a)
	{
			String temp = "Annika";
			for(int i = 0; i<a.length; i++){
			if(a[i] == temp){
			a[i] = a[a.length-3];
			a[a.length-3] = temp;
		}
		System.out.print(a[i]);
		if(i<a.length-1){
				System.out.print(", ");
				
				}
		}
	}
	
	public static void main (String[] args) {
		String array[] = {"Jaziel", "Annika", "Kimber", "Amelie", "Nikola", "Taliah", "Abdiel", "Fredy", "Zakai", "Karly"};
		printArray(array);
		replaceElement(array);
}
}

import java.util.Arrays;


public class Clone {
	public static void printArray(String[] a)
	{
		System.out.println("Akaash Banerjee. " + "Array Length: " + a.length);
		for(int i = 0; i<a.length; i++){
			System.out.print(a[i]);
			if(i<a.length-1){
				System.out.print(", ");
				
				}
			
			}
	}
	
	public static void cloneElement(String[] a)
	{
    String[] newArray = Arrays.copyOf(a, a.length);
    for (int i = 0; i < newArray.length; i++) {
        System.out.print(newArray[i]);
        if(i<a.length-1){
				System.out.print(", ");
				
				}
    }
}

		
	
	public static void main (String[] args) {
		String array[] = {"Jaziel", "Annika", "Kimber", "Amelie", "Nikola", "Taliah", "Abdiel", "Fredy", "Zakai", "Karly"};
		printArray(array);
		System.out.println(" ");
		cloneElement(array);
		
	}
}


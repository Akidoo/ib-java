
import java.util.Arrays;


public class Append {
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
	
	public static void appendElement(String[] a)
	{
    String newArray[] = new String[a.length+1];
    for (int i = 0; i < newArray.length; i++) {
		if(i<newArray.length-1){
		newArray[i] = a[i];
		
	}
		newArray[newArray.length-1] = "Jack";
        System.out.print(newArray[i]);
        if(i<a.length){
				System.out.print(", ");
				
				}
    }
}

		
	
	public static void main (String[] args) {
		String array[] = {"Jaziel", "Annika", "Kimber", "Amelie", "Nikola", "Taliah", "Abdiel", "Fredy", "Zakai", "Karly"};
		String newArray[] = new String[array.length+1];
		printArray(array);
		System.out.println(" ");
		appendElement(array);
		
	}
}


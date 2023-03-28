

public class Empty {
	
	public static boolean isEmpty (String[] a){
		boolean empty = true;
		for (int i=0; i<a.length; i++) {
	if (a[i] != null) {
		empty = false;
		
  }
  
}
return empty;
		
		
		}
	
	public static void main (String[] args) {
		String array[] = {"Jaziel", "Annika", "Kimber", "Amelie", "Nikola", "Taliah", "Abdiel", "Fredy", "Zakai", "Karly"};
		System.out.println(isEmpty(array));
	}
}


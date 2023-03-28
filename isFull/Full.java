


public class Full {
	
	public static boolean isFull(String[] a){
		boolean b = true;

//2
for(int i = 0; i < a.length; i++){
    if(a[i] == null){
        b = false;
    }
}


return b;
}
	
	public static void main (String[] args) {
		String array[] = {"Jaziel", "Annika", "Kimber", "Amelie", "Nikola", "Taliah", "Abdiel", "Fredy", "Zakai", "Karly"};
		System.out.println("Array is full: " + isFull(array));
	}
}



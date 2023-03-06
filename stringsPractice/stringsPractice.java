// Spot on, this is the way to do it!

public class stringsPractice {
	
	public static void main (String[] args) {
		//Input
		String ss = IBIO.input("enter a word: ");
		char[] xx = ss.toCharArray();
		
		//Print characters in the String
		for(int i = 0; i<ss.length(); i++){
			System.out.print(xx[i]);	
		}
			
			//Reverse String minus last element
		for(int i = ss.length()-2; i>=0; i--){
			System.out.print(xx[i]);
		}
		System.out.println();
	}
}


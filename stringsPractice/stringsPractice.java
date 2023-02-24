


public class stringsPractice {
	
	public static void main (String[] args) {
		//Input
		String ss = IBIO.input("enter a word: ");
		char[] xx = ss.toCharArray();
		
		//Print characters in the String
		for(int i = 0; i<ss.length(); i++){
			System.out.println(xx[i]);
			
			}
			
			//Reverse String minus last element
		for(int i = ss.length()-2; i>-1; i--){
			System.out.println(xx[i]);
		}
	}
}


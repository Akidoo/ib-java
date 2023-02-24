

//Do not understand why this doesn't work. Perhaps because xx is a char array?
public class binaryConverter {
	
	public static void main (String[] args) {
		String binary = IBIO.input("enter a binary number (8 bit): ");
		char[] xx = binary.toCharArray();
		int values[] = {128,64,32,16,8,4,2,1};
		int dValue = 0;
		int fValue = 0;
		
		for(int i = 0; i<binary.length(); i++){
			dValue = xx[i]*values[i];
			fValue += dValue;

			}
			System.out.println(fValue);
		
	}
}


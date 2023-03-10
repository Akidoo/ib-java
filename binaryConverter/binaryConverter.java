// problem was that you were multplying the ascii values of 0 and 1

public class binaryConverter {
	
	public static void main (String[] args) {
		
		String binary = IBIO.input("enter a binary number (8 bit): ");
		char[] xx = binary.toCharArray();
		int values[] = {128,64,32,16,8,4,2,1};
		int dValue = 0;
		int fValue = 0;
		
		for(int i = binary.length()-1; i>-1; i--) {
			dValue = Character.getNumericValue(xx[i])*values[i];
			// dValue = (xx[i] - 48) * values[i];
			fValue += dValue;
		}
		System.out.println(fValue);
	}
}


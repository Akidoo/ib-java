//yeah nah abandoning this its horribly innefficient

public class binaryConverter {
	
	public static void main (String[] args) {
		
		String binary = IBIO.input("enter a binary number: ");
		// remember to validate the input...
		char[] xx = binary.toCharArray();
		//int values[] = {128,64,32,16,8,4,2,1};
		//int mult = 1;
		int dValue = 0;
		//int fValue = 0;
		
		//for(int i = binary.length()-1; i>-1; i--)
		// this is the Java implementation of the snake algorithm (Horner's method)
		// http://www.cs.indiana.edu/cgi-pub/c211/snake/#snake
		for(int i = 0; i < binary.length; i++)
		{
			dValue = dValue * 2;
			//mult = mult*2;
			if(xx[i] == '1')
			{	dValue++;
			}
			//fValue += dValue;

			}
			System.out.println(dValue);
		
	}
}



//this one is broken too. I'll fix it later my brain hurts
public class betterBinaryConverter {
	
	public static void main (String[] args) {
		
		int mult = 0;
		String binary = "";
		//int sum = 0;
		int num = IBIO.inputInt("Input a denary number: ");
		System.out.print(num + " base 10 = ");
		//for(int i = 0; i<=8; i++)
		while(num>0)
		{
			binary = (num%2) + binary;
			num = num/10;
		}
		System.out.println(binary + " in base 2");
		
	}
}

